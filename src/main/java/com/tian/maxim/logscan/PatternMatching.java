package com.tian.maxim.logscan;

import sun.rmi.runtime.Log;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.cert.CertPathBuilderResult;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.PriorityQueue;
import java.util.Comparator;
/**
 * Created by Tian Liu on 9/20/16.
 */
public class PatternMatching {
    private Hashtable<String, LogErrorPattern> _error_message_bank;
    private PriorityQueue<LogErrorPattern> _reportLog;
    private String _filepath;

    PatternMatching(HashSet<LogErrorPattern> potential_errors , String filepath) {

        this._error_message_bank = new Hashtable<String, LogErrorPattern>();

        for (LogErrorPattern each_error : potential_errors) {
            this._error_message_bank.put(each_error.getPattern(), each_error);
        }

        this._filepath = filepath;

    }

    /**
     *
     * @return ZERO if there is no matched ERROR, None Zero O.W
     */
    public int isMatch() {
        Comparator<LogErrorPattern> myComparator = new ErrorMessageComparator();
        _reportLog = new PriorityQueue<LogErrorPattern>(15, myComparator);
        int returnCode = 0;
        File file = new File(_filepath);
        try {
            Scanner scanner = new Scanner(file);

            //now read the file line by line...
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if(this._error_message_bank.containsKey(line)) {
                    System.out.println("ho hum, i found it on line " +lineNum);
                    _reportLog.add(this._error_message_bank.get(line));
                    returnCode++;
                }
            }
        } catch(FileNotFoundException e) {
            //handle this
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
        return returnCode;
    }

    public void printErrorLog(){
        StringUtil file_name_paser = new StringUtil();
        String file_name = "Scaned_log_"+ file_name_paser.extractFileName(_filepath);

//        File file = new File(file_name);
        try{
//            file.createNewFile();
//            FileWriter writer = new FileWriter(file);
            PrintWriter writer = new PrintWriter(file_name);
            while (_reportLog.size() > 0) {
                String temp = _reportLog.poll().getPattern();
                System.out.println(temp);
                writer.println(temp);
            }
//            writer.flush();
            writer.close();
        } catch (java.io.IOException e)  {
            System.err.println("IOException: " + e.getMessage());
        }




    }




    class ErrorMessageComparator implements Comparator<LogErrorPattern> {

        public int compare(LogErrorPattern x, LogErrorPattern y) {
            if (x.getPriority() < y.getPriority()) return 1;
            if (x.getPriority() > y.getPriority()) return -1;
            return 0;
        }
    }
}


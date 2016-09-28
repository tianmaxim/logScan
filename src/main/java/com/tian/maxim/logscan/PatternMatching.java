package com.tian.maxim.logscan;

import sun.rmi.runtime.Log;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Created by Tian Liu on 9/20/16.
 */
public class PatternMatching {
    private Hashtable<String, LogErrorPattern> _error_message_bank;
    private PriorityQueue<LogErrorPattern> _reportLog;
    private String _filepath;

    PatternMatching(Hashtable<String, LogErrorPattern> error_message_bank, String filepath) {

        this._error_message_bank = error_message_bank;
        this._filepath = filepath;
    }

    public int isMatch() {
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
                }
            }
        } catch(FileNotFoundException e) {
            //handle this
        }
        return 0;
    }

    public void storeErrorLog(String errorLog){

    }

    public void printErrorLog(){

    }
}

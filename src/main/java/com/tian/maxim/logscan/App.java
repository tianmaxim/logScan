package com.tian.maxim.logscan;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        HashSet<LogErrorPattern> my_error_bank = new HashSet<LogErrorPattern>();
        Hashtable<String, LogErrorPattern> my_error_bank = new Hashtable<String, LogErrorPattern>();
        runPassMessage my_wrong_message = new runPassMessage();

        my_error_bank.put(my_wrong_message.getPattern(), my_wrong_message);

        if (args.length > 0) {
            PatternMatching my_pattern_Matching = new PatternMatching(my_error_bank, args[0]);
            System.out.println(my_pattern_Matching.isMatch());
            System.out.println(args[0] + "   " + args[1]);
        } else {
            System.out.println("Please enter the log file path!!");
            System.out.println(args[0]);
        }
    }
}

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
        HashSet<LogErrorPattern> my_error_bank = new HashSet<LogErrorPattern>();
        runPassMessage my_wrong_message = new runPassMessage();
        highPriorityMessage high_p_message = new highPriorityMessage();
        my_error_bank.add(my_wrong_message);
        my_error_bank.add(high_p_message);

        if (args.length > 0) {
            PatternMatching my_pattern_Matching = new PatternMatching(my_error_bank, args[0]);
            System.out.println(my_pattern_Matching.isMatch());
            System.out.println("++++++++++++");
            my_pattern_Matching.printErrorLog();
            System.out.println("+++++++++++++");
//            System.out.println(args[0] + "   " + args[1]);

        } else {
            System.out.println("Please enter the log file path!!");
            System.out.println(args[0]);
        }
    }
}

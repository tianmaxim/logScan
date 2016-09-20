package com.tian.maxim.logscan;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HashSet<LogErrorPattern> my_error_bank = new HashSet<LogErrorPattern>();

        runPassMessage my_wrong_message = new runPassMessage();

        my_error_bank.add(my_wrong_message);

        PatternMatching my_pattern_Matching = new PatternMatching(my_error_bank);

        System.out.println(my_pattern_Matching.isMatch());

        System.out.println(args[0]);
    }
}

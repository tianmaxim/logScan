package com.tian.maxim.logscan;

import junit.framework.TestCase;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by tliu3 on 9/29/16.
 */
public class PatternMatchingTest extends TestCase {
    public void testIsMatch() throws Exception {
        HashSet<LogErrorPattern> input_error = new HashSet<LogErrorPattern>();
        runPassMessage errorMg = new runPassMessage();
        highPriorityMessage h_p_Mg = new highPriorityMessage();
        input_error.add(errorMg);
        input_error.add(h_p_Mg);
        String path = "/home/tliu3/Downloads/DS1014X991768X4422.log.bad";
        PatternMatching myMatching = new PatternMatching(input_error, path);
 
        assertTrue(myMatching.isMatch() != 0);
        System.out.println("++++++++++++");
        myMatching.printErrorLog();
        System.out.println("+++++++++++++");
    }

    public void testString() throws Exception {
        Path myPath = Paths.get("c:\\home\\DS1014X991768X4422.log.bad");
//        System.out.println(myPath.getFileName());
        StringUtil myUtil = new StringUtil();
        String S = myUtil.extractFileName("c://home//DS1014X991768X4422.log.bad");
        System.out.println(S);
    }

}
package com.tian.maxim.logscan;

import java.util.HashSet;

/**
 * Created by Tian Liu on 9/20/16.
 */
public class PatternMatching {
    private HashSet<LogErrorPattern>_error_message_bank;

    PatternMatching(HashSet<LogErrorPattern> error_message_bank) {
        this._error_message_bank = error_message_bank;
    }

    public int isMatch() {
        return 0;
    } 
}

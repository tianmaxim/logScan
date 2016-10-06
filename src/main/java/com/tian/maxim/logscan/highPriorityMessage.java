package com.tian.maxim.logscan;

/**
 * Created by tliu3 on 10/6/16.
 */
public class highPriorityMessage implements LogErrorPattern {
    private String _pattern = "ORA-12545: Connect failed because target host or object does not exist";
    private int _priority = 1;

    public void setPattern(String errorMessage) {
        this._pattern = errorMessage;
    }

    public String getPattern() {
        return this._pattern;
    }

    public void setPriority(int errorPriority) {
        this._priority = errorPriority;
    }

    public int getPriority() {
        return this._priority;
    }
}

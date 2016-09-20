package com.tian.maxim.logscan;

/**
 * Created by tliu3 on 9/20/16.
 */
public class runPassMessage implements LogErrorPattern {
    private String _pattern = "run massage";
    private int _priority = 0;
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

package com.tian.maxim.logscan;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tian Liu on 9/20/16.
 * The interface define a log pattern object.
 *
 */
public interface LogErrorPattern {

    /**
     * Set the input as the look up message.
     * @param input The error message.
     */
    void setPattern(String input);

    /**
     * @return Error message.
     */
    String getPattern();

    /**
     * Set the input to be the pattern priority.
     * @param input pattern priority
     */
    void setPriority(int input);

    /**
     * @return Priority
     */
    int getPriority();

}

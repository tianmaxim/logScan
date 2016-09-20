# Design Doc: LogScan

LogErrorPattern: Interface
```
LogErrorPattern
    void setPattern(String input)
    String getPattern()
    void setPriority(int input)
    int getPriority()
```

PatternMatching: Logic
```
     boolean isMatch()
     void storeErrorLog(String errorLog)
     void printErrorLog()
```
## DataStructure
    error_message_bank: HashSet<LogErorPattern>
    error_log_bank: HashSet<String>

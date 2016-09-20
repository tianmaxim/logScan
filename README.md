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
PatternMatching
     boolean isMatch()
     void storeErrorLog(String errorLog)
     void printErrorLog()
```

Main: Program init
```
Main
```
## DataStructure
    error_message_bank: HashSet<LogErorPattern>
    error_log_bank: HashSet<String>

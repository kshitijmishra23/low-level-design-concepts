package com.scaler.operator;

import java.util.HashSet;
import java.util.Set;

public class OperatorManager {
    private static Set<String> operatorList;
    private static OperatorManager operatorManagerInstance = null;
    private static Object mutex = new Object();

    public static OperatorManager getInstance(){
     if(operatorManagerInstance == null) {
         synchronized (mutex) {
             if(operatorManagerInstance == null) {
                 operatorManagerInstance = new OperatorManager();
             }
         }

     }
     return operatorManagerInstance;
    }

    private OperatorManager() {
        operatorList = new HashSet<>();
        operatorList.add("<");
        operatorList.add(">");
        operatorList.add("AND");
        operatorList.add("OR");
        operatorList.add("==");
    }

    public boolean isOperator(String operator) {
        if(operatorList.contains(operator)){
            return true;
        }
         return false;
    }

}

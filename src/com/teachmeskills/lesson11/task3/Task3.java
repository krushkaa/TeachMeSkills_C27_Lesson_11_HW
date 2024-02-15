package com.teachmeskills.lesson11.task3;

public class Task3 {
    public static void doubleEverySymbol(String str3) {
        char[] stringSymbolArray = str3.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char i : stringSymbolArray) {
            result.append(i);
            result.append(i);
        }
        System.out.println(result);
    }
}

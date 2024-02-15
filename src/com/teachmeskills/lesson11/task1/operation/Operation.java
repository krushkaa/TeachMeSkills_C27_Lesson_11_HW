package com.teachmeskills.lesson11.task1.operation;

public class Operation {
    public static void printNumbers(String str) {
        String[] docNumArray = str.split("-");
        System.out.println(str.substring(0, 4) + " " + str.substring(9, 13));
    }

    public static void documentNumber(String str) {
        System.out.println(str.substring(0, 5) + "***" + str.substring(8, 14) + "***" + str.substring(17));
    }

    public static void documentLetter(String str) {
        System.out.println(str.substring(5, 8).toLowerCase() + "/"
                + str.substring(14, 17).toLowerCase() + "/"
                + str.substring(19, 20).toLowerCase() + "/"
                + str.substring(21).toLowerCase());
    }

    public static void letterWithStringbuilder(String str) {
        StringBuilder str1 = new StringBuilder("Letters: ");
        System.out.println(str1.append(str.toUpperCase()).delete(9, 14).replace(12, 18, "/")
                .replace(16, 18, "/").replace(18, 19, "/"));
    }

    public static void checkABC(String str) {
        if (str.toLowerCase().contains("abc")) {
            System.out.println("The document contains 'abc'");
        } else {
            System.out.println("The document doesn't contain 'abc'");
        }
    }

    public static void checkStartWith555(String str) {
        if (str.startsWith("555")) {
            System.out.println("The document starts with '555'");
        } else {
            System.out.println("The document doesn't start with '555'");
        }
    }

    public static void checkEndWith1a2b(String str) {
        if (str.toLowerCase().endsWith("1a2b")) {
            System.out.println("The document ends with '1a2b'");
        } else {
            System.out.println("The document doesn't end with '1a2b'");
        }
    }
}

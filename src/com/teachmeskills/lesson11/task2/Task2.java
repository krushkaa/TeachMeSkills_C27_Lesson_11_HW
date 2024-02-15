package com.teachmeskills.lesson11.task2;

public class Task2 {
    public static void findShortestAndLongestWord(String str2) {
        String[] a = str2.split(" ");
        int min = a[0].length();
        int max = a[0].length();
        String minStr = "";
        String maxStr = "";

        for (int i = 0; i < a.length; i++) {
            if (min >= a[i].length()) {
                min = a[i].length();
                minStr = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i].length()) {
                max = a[i].length();
                maxStr = a[i];
            }
        }
        System.out.println("Самое маленькое слово - " + minStr + ". Самое большое слово - " + maxStr + ".");
    }
}



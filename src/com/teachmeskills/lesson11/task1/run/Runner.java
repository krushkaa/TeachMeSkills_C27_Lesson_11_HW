package com.teachmeskills.lesson11.task1.run;

import com.teachmeskills.lesson11.task1.operation.Operation;

public class Runner {
    public static void main(String[] args) {
        String str = "7531-QnP-2223-pHm-1K5N";
        Operation.printNumbers(str);
        Operation.documentNumber(str);
        Operation.documentLetter(str);
        Operation.letterWithStringbuilder(str);
        Operation.checkABC(str);
        Operation.checkStartWith555(str);
        Operation.checkEndWith1a2b(str);

    }
}
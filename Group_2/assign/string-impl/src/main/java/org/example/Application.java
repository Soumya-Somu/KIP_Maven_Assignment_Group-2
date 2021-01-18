package org.example;

import org.example.StringFunctions;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = obj.nextLine();
        StringFunctions sf = new StringFunctions();
        System.out.println("Reversed string :" + sf.stringReverse(s));
        System.out.println("Lenght :" + sf.stringLenght(s));
    }
}

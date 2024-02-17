package org.example;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string 1 : ");
        String input1 = scanner.nextLine();
        System.out.print("Input string 2 : ");
        String input2 = scanner.nextLine();
        int totalLen = input1.length() + input2.length();

        //Combined length
        System.out.println("The total length of both string is : " + totalLen);

        //Lexicographical value comparison
        int compareResult = input1.compareTo(input2);
        if (compareResult >= 1){
            result = new String(input1 + " has bigger lexicographical value than " + input2);
        } else if (compareResult <= -1) {
            result = new String(input2 + " has bigger lexicographical value than " + input1);
        }else {
            result = new String("Both have the same lexicographical value");
        }
        System.out.println(result);

        //Combined string
        if (isUpperCase(input2.charAt(0))){ //check apakah upper case
            System.out.println("Combined string : " + input1 + " " + input2);
        }else {
            System.out.println("Combined string : " + input1 + input2);
        }

    }
}
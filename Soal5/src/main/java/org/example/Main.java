package org.example;

import java.util.Scanner;

public class Main {
    public static String compareTo(String str1, String str2){
        String result;
        int str1Val = countLexi(str1);
        int str2Val = countLexi(str2);
        if (str1Val > str2Val){
            result = new String(str1 + " has bigger lexicographical value than " + str2);
        } else if (str1Val<str2Val) {
            result = new String(str2 + " has bigger lexicographical value than " + str1);
        }else {
            result = new String("Both have the same lexicographical value");
        }
        return result;
    }

    public static int countLexi(String str){
        int value = 0;
        for(int i = 0;i<str.length();i++)
        {
            value = value + str.charAt(i);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string 1 : ");
        String input1 = scanner.nextLine();
        System.out.print("Input string 2 : ");
        String input2 = scanner.nextLine();
        int totalLen = input1.length() + input2.length();
        System.out.println("The total length of both string is : " + totalLen);
        System.out.println(compareTo(input1, input2));
        System.out.println("Combined string : " + input1 + " " + input2);
    }
}
package org.example;




import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            System.out.println("Limit tipe data Byte : " + Byte.MIN_VALUE + " Sampai " + Byte.MAX_VALUE);
            System.out.println("Limit tipe data Short : " + Short.MIN_VALUE + " Sampai " + Short.MAX_VALUE);
            System.out.println("Limit tipe data Integer : " + Integer.MIN_VALUE + " Sampai " + Integer.MAX_VALUE);
            System.out.println("Limit tipe data Long : " + Long.MIN_VALUE + " Sampai " + Long.MAX_VALUE);
            System.out.println("Jika error, artinya tidak ada tipe data primitif numerik yang dapat menampungnya");
            Scanner read = new Scanner(System.in);
            Long angka = read.nextLong();
            System.out.println("Tipe data yang dapat menampung "+angka+" :");
            if (angka >= 0) {
                if (angka <= Long.MAX_VALUE){
                    System.out.println("Long");
                    if(angka <= Integer.MAX_VALUE){
                        System.out.println("Integer");
                        if (angka <= Short.MAX_VALUE){
                            System.out.println("Short");
                            if (angka<=Byte.MAX_VALUE){
                                System.out.println("Byte");
                            }
                        }
                    }
                }
            }else {
                if (angka >= Long.MIN_VALUE){
                    System.out.println("Long");
                    if(angka >= Integer.MIN_VALUE){
                        System.out.println("Integer");
                        if (angka >= Short.MIN_VALUE){
                            System.out.println("Short");
                            if (angka>=Byte.MIN_VALUE){
                                System.out.println("Byte");
                            }
                        }
                    }
                }
            }
            System.out.println("FINISH");

        }
    }

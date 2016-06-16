package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random r = new Random();

        for (int l = 1; l <= 26; l++) {

            int a = r.nextInt(25) + 65;
//            System.out.println(a);
            char ch = (char) a;
            System.out.println(ch + "=" + a);

            switch (a){

                case 'A':
                    System.out.print( ch + "=" + a + "  " + 'A' + " is a vowel \n");
                    break;

                case 'E':
                    System.out.print( ch + "=" + a + "  " +'E' + " is a vowel ");
                    break;

                case 'I':
                    System.out.println( ch + "=" + a + "  " +'I' + " is a vowel ");
                    break;

                case 'O':
                    System.out.println( ch + "=" + a + "  " +'O' + " is a vowel ");
                    break;

                case 'U':
                    System.out.println( ch + "=" + a + "  " +'U' + " is a vowel ");
                    break;
}}}}
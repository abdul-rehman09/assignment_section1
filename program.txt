package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int random = r.nextInt(4);

        int a ;
        boolean n= false;
        System.out.println("You have only 3 chance to guess number between 0 to 4\n");

        int t =0;
             while(t<3){

                 System.out.print("enter value to guess\n");
                 Scanner s = new Scanner(System.in);
                 a=s.nextInt();

            if (a == random) {
                    System.out.println("value is correct");

            break;}
            else {
                System.out.println("wrong answer");
            }
            t++;
             }
    }
}


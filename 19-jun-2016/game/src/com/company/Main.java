package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0;
        char array [][]= new char [3][3];
        char mark;
        System.out.println("Enter position number to mark");
        System.out.println(" 1  | 2   | 3  ");
        System.out.println(" ----------- ");
        System.out.println(" 4  | 5   | 6  ");
        System.out.println(" ----------- ");
        System.out.println(" 7  | 8   | 9  ");
        System.out.println("The Numbers in this diagram is for position");
        label:
               for(int i=0;i<9;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter position");
            int input = scan.nextInt();
            if(i%2==0){
                mark= 'O';
            }
            else{
                mark='X';
            }
            switch (input) {
                case 1:
                    if(a==0)
                {
                    array[0][0] = mark;
                    System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                    System.out.println(" ------------- ");
                    System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                    System.out.println(" ------------- ");
                    System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");
                    a = 1;
                }
                    else{
                        i--;}
                        continue label;
                case 2:
                    if(b==0)
                    {
                        array[0][1] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");
                        b = 1;
                    }
                    else{
                        i--;}
                        continue label;
                case 3:
                    if(c==0)
                    {
                        array[0][2] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");
                        c = 1;
                    }
                    else {
                        i--;}
                        continue label;
                case 4:
                    if(d==0)
                    {
                        array[1][0] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");

                        d = 1;
                    }
                    else {
                        i--;}
                        continue label;
                case 5:
                    if(e==0)
                    {
                        array[1][1] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");
                        e = 1;
                    }
                    else {
                        i--;}
                        continue label;
                case 6:
                    if(f==0)
                    {
                        array[1][2] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");

                        f = 1;
                    }
                    else {
                        i--;}
                        continue label;
                case 7:
                    if(g==0)
                    {
                        array[2][0] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");
                        g= 1;
                    }
                    else {
                        i--;}
                        continue label;
                case 8:
                    if(h==0)
                    {
                        array[2][1] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");
                        h= 1;
                    }
                    else {
                        i--;}
                        continue label;
                case 9:
                    if(j==0)
                    {
                        array[2][2] = mark;
                        System.out.println(array[0][0] + "  | " + array[0][1] + "   | " + array[0][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[1][0] + "  | " + array[1][1] + "   | " + array[1][2] + "  ");
                        System.out.println(" ------------- ");
                        System.out.println(array[2][0] + "  | " + array[2][1] + "   | " + array[2][2] + "  ");

                            j = 1;
                    }
                    else {
                            i--;}
                    continue label;

                default:
                    System.out.println("Enter Correct Position Number");
                    break;
            }
        }
}}

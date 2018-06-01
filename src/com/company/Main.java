package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your test score: \n ");
        int score = scan.nextInt();
        String grade = "F";//I'm not hopeful

        if (score > 89) {
            if (score < 93) {
                grade = "A-";
            } else if (score > 96) {
                grade = "A+";

            } else {
                grade = "A";
            }
        }

            else if (score > 79)
            if (score < 84) {
                grade = "B-";
            } else if (score > 84) {
                grade = "B+";

            } else {
                grade = "B";
            }

            else if (score > 69)
            if (score < 74) {
                grade = "C-";
            } else if (score > 74) {
                grade = "C+";

            } else {
                grade = "C";
            }

            else if (score > 60)
            if (score < 64) {
                grade = "D-";
            } else if (score > 66) {
                grade = "D+";

            } else {
                grade = "D";
            }
            else
                grade = "F";

            if (score > 69)
                System.out.println("Very good! You don't have to retake the exam! \n" + grade);
            else
                System.out.println("Did you even look at the book? \n" + grade);


        }

    }
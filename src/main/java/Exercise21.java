/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize month_name
        String month_name = " ";
        //prompt the user to enter a number from 1 to 12, representing one of the months
        System.out.print("Please enter the number of the month: ");
        int month = in.nextInt();
        //now make a switch and case
        switch(month) {
            case 1:
                month_name = "January";
                break;
            case 2:
                month_name = "February";
                break;
            case 3:
                month_name = "March";
                break;
            case 4:
                month_name = "April";
                break;
            case 5:
                month_name = "May";
                break;
            case 6:
                month_name = "June";
                break;
            case 7:
                month_name = "July";
                break;
            case 8:
                month_name = "August";
                break;
            case 9:
                month_name = "September";
                break;
            case 10:
                month_name = "October";
                break;
            case 11:
                month_name = "November";
                break;
            case 12:
                month_name = "December";
                break;
            default:
                System.out.print("That is an invalid month number.");
        }
        //tell the user the month for the number they selected
        if(month >= 1 && month <= 12) {
            System.out.printf("The name of the month is %s.", month_name);
        }
    }
}

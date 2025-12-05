package com.week;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WeekDays today = null;

        while (true) {
            WeekDays.daysOptions();
            while (true) {
                String number = sc.nextLine();

                today = WeekDays.fromNumber(number);

                if (today == null) {
                    System.out.println("Invalid day, try again");
                    continue;
                } else {
                    break;
                }
            }

            System.out.println(today.mensage());
        }
    }
}


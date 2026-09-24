package com.DSA.Arrays;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class DateAndTime {

    public static void main(String[] args) {
        // Current date
        LocalDate d = LocalDate.now();

        System.out.println("Current date = " + d);
        //Current time
        LocalTime t = LocalTime.now();
        System.out.println("Current time = " + t);
        // Current date and time
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current date and time = " + dt);
      
        LocalDate d1 = LocalDate.of(2026, 9, 23);
        System.out.println("Date = " + d1);
   
        LocalTime t1 = LocalTime.of(10, 30, 20);
        System.out.println("Time = " + t1);
        //  Create date and time
        LocalDateTime dt1 =
                LocalDateTime.of(2026, 9, 23, 10, 30);
        System.out.println("Date and time = " + dt1);
        System.out.println("Day = " + d.getDayOfMonth());
        System.out.println("Month = " + d.getMonth());
        System.out.println("Month number = " + d.getMonthValue());

        System.out.println("Year = " + d.getYear());

        System.out.println("Day of week = " + d.getDayOfWeek());

        System.out.println("Day of year = " + d.getDayOfYear());
        System.out.println("Hour = " + t.getHour());

        System.out.println("Second = " + t.getSecond());
        LocalDate d2 = d.plusDays(10);
        System.out.println("After 10 days = " + d2);

        LocalDate d3 = d.plusMonths(2);

        System.out.println("After 2 months = " + d3);

        LocalDate d4 = d.plusYears(1);

        System.out.println("After 1 year = " + d4);


        LocalDate d5 = d.minusDays(10);

        System.out.println("10 days before = " + d5);

        LocalDate leap = LocalDate.of(2024, 1, 1);

        if(leap.isLeapYear()) {
            System.out.println("2024 is leap year");
        }
        else {
            System.out.println("2024 is not leap year");
        }


        // Check weekend

        if(d.getDayOfWeek().toString().equals("SATURDAY") ||
           d.getDayOfWeek().toString().equals("SUNDAY")) {

            System.out.println("Today is weekend");
        }
        else {
            System.out.println("Today is weekday");
        }


        // Find age

        LocalDate dob = LocalDate.of(2004, 7, 9);

        LocalDate today = LocalDate.now();

        Period p = Period.between(dob, today);

        System.out.println("Age = " + p.getYears());


        //  Format date

        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String x = d.format(f);

        System.out.println("Formatted date = " + x);


        //  Format date and time

        DateTimeFormatter f1 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String x1 = dt.format(f1);

        System.out.println("Formatted date time = " + x1);


        // Convert String into date

        String str = "23-09-2026";

        DateTimeFormatter f2 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate newDate =
                LocalDate.parse(str, f2);

        System.out.println("String to date = " + newDate);


        //Convert String into date and time

        String str1 = "23-09-2026 10:30:00";

        DateTimeFormatter f3 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        LocalDateTime newDateTime =
                LocalDateTime.parse(str1, f3);

        System.out.println("String to date time = " + newDateTime);

        // Number of days in month
        System.out.println("Days in month = "
                + d.lengthOfMonth());

        // Number of days in year
        System.out.println("Days in year = "
                + d.lengthOfYear());

        // India time
        ZonedDateTime india =
                ZonedDateTime.now(
                        ZoneId.of("Asia/Kolkata"));

        System.out.println("India time = " + india);

    }
}
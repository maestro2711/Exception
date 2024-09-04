package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //LocalDateTime = Datum & Uhrzeit

        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate currentDate = LocalDate.now();
        System.out.println("today date:" +currentDate);

        LocalDate newDate=currentDate.plusWeeks(2);

        //format the date for output

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = formatter.format(newDate);
        System.out.println("Date after adding 2 weeks: "+formatDate);

        //specified a future date

        LocalDate futuredate = currentDate.plusWeeks(3);

        if(currentDate.isBefore(futuredate)){
            System.out.println("current date is before future date");
        } else if (currentDate.isAfter(futuredate)) {
            System.out.println("current date is after future date");

        } else {
            System.out.println("current date is the same as future date");
        }


    }
}
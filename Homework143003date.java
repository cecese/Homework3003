package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Homework143003date {
    public static void main(String[] args) {
        LocalDate dateObject;
        dateObject = LocalDate.now();
        System.out.println("Current date: " + dateObject );
        LocalTime timeObject;
        timeObject = LocalTime.now();
        System.out.println("Current time: " + timeObject);
        LocalDateTime dateAndTime;
        dateAndTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateAndTime);
    }



}

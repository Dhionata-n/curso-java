package aplication;

import model.entites.Resevation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {


            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = format.parse(sc.next());
            System.out.println("Check-Out date (dd/MM/yyyy): ");
            Date checkOut = format.parse(sc.next());

            Resevation resevation = new Resevation(number, checkIn, checkOut);
            System.out.println("Resevation: " + resevation);
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = format.parse(sc.next());
            System.out.println("Check-Out date (dd/MM/yyyy): ");
            checkOut = format.parse(sc.next());

            Date now = new Date();


            resevation.updateDates(checkIn, checkOut);
            System.out.println("Resevation: " + resevation);
        }
        catch (ParseException e ){
            System.out.println("Invaalid format date");
        }
        catch (DomainException e){
            System.out.println("Error in reservation "+ e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unespect Error");
        }



    }
}
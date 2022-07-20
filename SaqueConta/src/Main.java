import model.entites.Accont;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();
        Accont accont = new Accont(number, holder,balance,withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw:");
            accont.withdraw(sc.nextDouble());
        }
        catch (DomainException e ){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
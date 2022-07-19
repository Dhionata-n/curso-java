import entites.Employer;
import entites.OutsourcedEmployer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Employer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of emplooyess: ");
        int n = sc.nextInt();

        for (int i = 0; i<n ;i++ ){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n) ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch=='y'){
                System.out.println("Addicional Charge:");
                double additionatalCharge = sc.nextDouble();

                list.add(new OutsourcedEmployer(name,hours,valuePerHour,additionatalCharge));
                            }
            else {
            list.add(new Employer(name,hours,valuePerHour));
            }

        }
        System.out.println();
        for (Employer emp: list
        ) {
            System.out.println(emp.getName() + " - $ " +String.format("%.2f", emp.payment()));

        }

        sc.close();



    }
}
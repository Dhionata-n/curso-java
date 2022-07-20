import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");

    }
    public static void method1(){
        System.out.println("****Inicio metodo 1*****");
        method2();
        System.out.println("****Final metodo 1*****");
    }
    public static void method2(){
        System.out.println("****Inicio metodo 2*****");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();

            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid character");
            e.printStackTrace();
        }
        System.out.println("****Final metodo 2*****");
        sc.close();
    }
}
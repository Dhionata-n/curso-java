import entites.ImportProduct;
import entites.Product;
import entites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Product> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i<n ; i++){
            System.out.println("Product #"+(i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (type=='c'){
                Product product = new Product(name,price);
                list.add(product);
            }
            if (type=='i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product product = new ImportProduct(name,price,customsFee);
                list.add(product);
            }
            if(type=='u'){

                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();

                Date manufactureDate = formatador.parse(date);

                Product product = new UsedProduct(name,price,manufactureDate);
                list.add(product);
            }


        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product:list
             ) {
            System.out.println(product.priceTag());

        }

    }
}
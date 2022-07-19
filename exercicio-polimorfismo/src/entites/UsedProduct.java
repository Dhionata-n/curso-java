package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }


    public String priceTag(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        return super.getName() + " (used)" + " $ " + String.format("%.2f", super.getPrice()) + " (Manufacture date: "
                + formatador.format(manufactureDate) + " )";
    }
}

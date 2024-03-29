package entites;

public class ImportProduct extends Product{
    private Double customsFee;

    public ImportProduct() {
        super();
    }

    public ImportProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice()+customsFee;
    }

    @Override
    public String priceTag(){

        return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " Customs fee: $ " + String.format("%.2f", customsFee);
    }


}

package entites;

public class OutsourcedEmployer extends Employer {

    private Double additionalCharge;

    public OutsourcedEmployer() {
        super();
    }

    public OutsourcedEmployer(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){

        return  super.payment() + additionalCharge*1.1;
    }


}


package model.entites;

import model.exceptions.DomainException;

public class Accont {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Accont(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;

    }

    public void withdraw (Double amount) throws DomainException {


        if(amount > this.withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if(this.balance< amount){
            throw new DomainException("Not enough balance");
        }
        this.balance -= amount;
        System.out.printf("New balance: %.2f",this.balance);
    }
}

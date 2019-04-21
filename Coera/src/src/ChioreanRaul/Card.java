package src.ChioreanRaul;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Card {
    public String name;
    protected double amount;
    protected LocalDate ExpirationDate;
    protected double WithdrawLimit;
    Cost cost;
    protected LocalDate CurrentDate;
    protected double limit;



    public Card(String name, double amount, LocalDate ExpirationDate, double WithdrawLimit, LocalDate CurrentaDate){
        this.name = name;
        this.amount = amount;
        this.ExpirationDate = ExpirationDate;
        this.WithdrawLimit = WithdrawLimit;
        this.CurrentDate = CurrentaDate;
        this.limit = WithdrawLimit;

    }

    public  double getCost(){
        return cost.fee;
    }


    void setAmount(double amount){
        this.amount = amount;
    }
    void setExpirationDate(LocalDate expirationDate){
        this.ExpirationDate = expirationDate;
    }
    void setWithdrawLimit(double withdrawLimit){
        this.WithdrawLimit = withdrawLimit;
    }
    protected boolean withdraw(){
        if(WithdrawLimit > 0 && ExpirationDate.isAfter(LocalDate.now()) && amount != 0){
            return true;
        }
        return false;
    }
}

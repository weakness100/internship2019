package src.ChioreanRaul;

import java.time.LocalDate;
import java.util.*;

public class Transaction   {

    double amount;
    User user;
    double tva;
    String cardN;





    public Transaction(double amount, User user, double tva, String cardN) {
        this.amount = amount;
        this.user = user;
        this.tva = tva;
        this.cardN = cardN;

        isValid();


    }



    public void isValid(){

        Set<Map.Entry<Card, Cost>> map = user.cards.entrySet();
        for(Map.Entry<Card, Cost> m : map){
            if(m.getKey().WithdrawLimit >= amount && m.getKey().ExpirationDate.isAfter(LocalDate.now()) && m.getKey().amount != 0 && m.getKey().amount >= amount){
                System.out.println("Card : " + m.getKey().name + "\nTva and Fee payed : " + (tva * amount + m.getValue().fee * amount));
            }else{
                if(!(LocalDate.now().equals(m.getKey().CurrentDate))){
                    m.getKey().CurrentDate = LocalDate.now();
                    m.getKey().WithdrawLimit = m.getKey().limit;
                }else {
                    System.out.println("Card : " + m.getKey().name +  " not valid");
                }
            }
        }

    }


    public void finalizedTranzaction() {
        Set<Map.Entry<Card, Cost>> map = user.cards.entrySet();


        for(Map.Entry<Card, Cost> m : map){
            if(this.cardN.equals(m.getKey().name)){
                amount = amount - m.getKey().amount;
                if(m.getKey().WithdrawLimit >= amount && m.getKey().ExpirationDate.isAfter(LocalDate.now()) && m.getKey().amount != 0 ){
                    for (Double i : user.list1){
                        for(Map.Entry<Card, Cost> m2 : map){
                            if(m2.getValue().fee == i){
                                if(!(m.getKey().name.equals(m2.getKey().name)) ){
                                    if((amount + amount * m2.getValue().fee) <= m2.getKey().WithdrawLimit){
                                        if((amount + amount * m2.getValue().fee) <= m.getKey().amount){
                                            m.getKey().amount = m.getKey().amount + amount ;
                                            m2.getKey().amount = m2.getKey().amount - amount - amount * m2.getValue().fee;
                                            amount = amount - amount ;
                                            m2.getKey().WithdrawLimit = m2.getKey().WithdrawLimit - amount - amount * m2.getValue().fee;



                                        }else {
                                            m.getKey().amount = m.getKey().amount + m2.getKey().amount - m2.getKey().amount * m2.getValue().fee;
                                            amount = amount - m2.getKey().amount + m2.getKey().amount * m2.getValue().fee;
                                            m2.getKey().WithdrawLimit = m2.getKey().WithdrawLimit - m2.getKey().amount - m2.getKey().amount * m2.getValue().fee ;
                                            m2.getKey().amount = m2.getKey().amount - m2.getKey().amount;


                                        }
                                    }else{
                                        if((amount + amount * m2.getValue().fee) <= m.getKey().amount){
                                            m.getKey().amount = m.getKey().amount + m2.getKey().WithdrawLimit - m2.getKey().WithdrawLimit * m2.getValue().fee;
                                            m2.getKey().amount = m2.getKey().amount - m2.getKey().WithdrawLimit;
                                            amount = amount - m2.getKey().WithdrawLimit + m2.getKey().WithdrawLimit * m2.getValue().fee;
                                            m2.getKey().WithdrawLimit = m2.getKey().WithdrawLimit - m2.getKey().WithdrawLimit;


                                        }else {
                                            m.getKey().amount = m.getKey().amount + m2.getKey().amount - m2.getKey().amount * m2.getValue().fee;
                                            amount = amount - m2.getKey().amount + m2.getKey().amount * m2.getValue().fee;
                                            m2.getKey().WithdrawLimit = m2.getKey().WithdrawLimit - m2.getKey().amount;
                                            m2.getKey().amount = m2.getKey().amount - m2.getKey().amount;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Amount : " + m.getKey().amount + " from which the fee + tva is : " + (tva * m.getKey().amount + m.getValue().fee * m.getKey().amount));

            }

        }


    }
}

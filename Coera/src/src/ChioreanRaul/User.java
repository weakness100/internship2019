package src.ChioreanRaul;

import java.time.LocalDate;
import java.util.*;

public class User  {
    Map<Card, Cost> cards = new HashMap<>();

    Transaction transaction;
    Cost cost;
    List<Double> list1;

    User(){

    }


    public void addCards(String cardName, double amount, LocalDate ExpirationDate, double WithdrawLimite, double fee){

        cards.put(new Card(cardName, amount, ExpirationDate, WithdrawLimite, LocalDate.now()), new Cost(fee));
        SortedMap<Card, Cost> cards = new TreeMap<>();
        cards.putAll(cards);


    }
    public Map<Card, Cost> getCardsCost() {
        Map<Card, Cost> hm = new HashMap<>();
        Set<Map.Entry<Card, Cost>> st = cards.entrySet();
        for(Map.Entry<Card, Cost> map : st){

        }

        return  cards;
    }
    public void removeCard(String name){
        Set<Map.Entry<Card, Cost>> st = cards.entrySet();
        for(Map.Entry<Card, Cost> map : st){
            if(map.getKey().name.equals(name)){
                cards.remove(name);
            }

        }
    }

    public  void sortByValue(Map<Card, Cost> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<Card, Cost>> list =
                new LinkedList<Map.Entry<Card, Cost>>(unsortMap.entrySet());

        // 2. Sort list
        Double temp;
        list1 = new ArrayList<>();
        for(Map.Entry<Card, Cost> i : list){
            list1.add(i.getValue().fee);
        }
        for(int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if(list1.get(j) > list1.get(i)){
                    temp = list1.get(i);
                    list1.set(i,list1.get(j));
                    list1.set(j,temp);
                }
            }
        }
    }

}

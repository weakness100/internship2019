package src.ChioreanRaul;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        User users = new User();
        while (true){
            Scanner ss = new Scanner(System.in);
            System.out.print("1. Add card\n2. Remove card\n3. Add transaction\n4. View cards\n" );
            switch (ss.nextInt()){
                case 1 :SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

                    Scanner in = new Scanner(System.in);

                    File file =
                            new File("D:\\drive\\An3\\SEM 2\\RTS\\laburi\\Corea\\src\\ChioreanRaul\\reader.txt");
                    BufferedReader br = null;
                    String line = "";
                    String cvsSplitBy = " ";

                    try {

                        br = new BufferedReader(new FileReader(file));
                        while ((line = br.readLine()) != null) {

                            // use comma as separator
                            String[] a= line.split(cvsSplitBy);

                            users.addCards(a[0],Double.parseDouble(a[1]),LocalDate.of(Integer.parseInt(a[5]), Integer.parseInt(a[4]), Integer.parseInt(a[3])),Double.parseDouble(a[2]), Double.parseDouble(a[6]));
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (br != null) {
                            try {
                                br.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    users.sortByValue(users.cards);

                    break;

                case 2 :
                    in = new Scanner(System.in);

                    System.out.println("Card name : ");

                    users.removeCard(in.nextLine());
                    break;

                case 3 :
                    Scanner in1 = new Scanner(System.in);



                    System.out.println("Tva : ");

                    double tva = in1.nextDouble();

                    in1.nextLine();

                    System.out.println("What card do you want to use : ");

                    String cardN = in1.nextLine();

                    System.out.println("Amount : ");

                    Transaction transaction = new Transaction(in1.nextDouble(), users, tva, cardN);



                    transaction.finalizedTranzaction();
                    break;
                case 4 :
                    Set<Map.Entry<Card, Cost>> st = users.cards.entrySet();
                    for (Map.Entry<Card, Cost> m : st){
                        System.out.println("Card name : " + m.getKey().name +", fee : " + m.getValue().fee + ", Withdraw limit : " + m.getKey().WithdrawLimit + ", Expiration date : " + m.getKey().ExpirationDate + ", Available Amount : " + m.getKey().amount);
                    }
            }



        }





        // write your code here




//        Set <Map.Entry<Card, Cost>> st = users.getCardsCost().entrySet();
//        for (Map.Entry<Card, Cost> cards : st){
//            System.out.print(cards.getKey().name + ":" + cards.getValue().fee + ":" );
//
//        }








    }
}

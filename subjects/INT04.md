**Given a user situated in location A, and 4 ATMS such that:**
1. The walking time between starting point and ATMs as well as between each ATMs is presented below:

    | From                 | To           | Duration (minutes) |
    |----------------------|--------------|--------------------|
    | User starting point  | ATM 1        | 5                  |
    | User starting point  | ATM 2        | 60                 |
    | User starting point  | ATM 3        | 30                 |
    | User starting point  | ATM 4        | 45                 |
    | ATM 1                | ATM 2        | 40                 |
    | ATM 1                | ATM 4        | 45                 |
    | ATM 2                | ATM 3        | 15                 |
    | ATM 3                | ATM 1        | 40                 |
    | ATM 3                | ATM 4        | 15                 |
    | ATM 4                | ATM 2        | 30                 |

2. Each ATM has the same amount of money equal with 5000 lei, and the following schedule:

    | ATM Name | Opening time | Closing time |
    |----------|--------------|--------------|
    | ATM 1    | 12:00        | 18:00        |
    | ATM 2    | 10:00        | 17:00        |
    | ATM 3    | 22:00        | 13:00        |
    | ATM 4    | 17:00        | 01:00        |

3. User has 6 credit cards with the following properties:

    | Credit card | Fee     | Withdraw limit (lei) / day  | Expiration date| Available Amount (lei)|
    |-------------|---------|-----------------------------|----------------|-----------------------|
    | SILVER      | 0.2%    | 2000                        | 23.05.2020     | 4000                  |
    | GOLD        | 0.1%    | 2000                        | 15.08.2018     | 2000                  |
    | PLATINUM    | 0.3%    | 2000                        | 20.03.2019     | 3000                  |
    | IRIDIUM     | 0.2%    | 2000                        | 23.06.2020     | 5000                  |
    | BRONZE      | 0.5%    | 2000                        | 15.07.2019     | 2500                  |
    | PREMIUM     | 0.15%   | 2000                        | 20.08.2019     | 2000                  |

4. Current date and time is: *19th March, 2019 - 11:30*

**Please write an application using either Java or C# programming language in order to:**

2. <h5>Subject code = INT04 </h5>
 A user wants to do an online transaction for a total of 10000 lei to buy a product with TVA 19%.
 Write an application that will compute the TVA amount and fee amount payed from each card for the above mentioned product.
 
 If the full amount is not available in one card, the user needs to first move the needed money from
 one card to another using the smallest fee.
 
 Transactions can be made only using valid cards. 
 
 The application should implement the following method:

    public Map<Card, Cost> getCardsCost() {
        // TODO: add your code here
    }

 Where Cost should contain the above mentioned amounts (tva, fee).

**Note:**

1. *All dates are in the same timezone.*
2. *Only specified constraints are to be taken in consideration.*
3. *The application should work for any set of similar input*
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

3. User has 3 economy accounts with the following properties:


    | Economy Account |Interest Rate  (year)         | Amount Interval (RON) | Expiration date| Available Amount (RON)|
    |-----------------|------------------------------|-----------------------|----------------|-----------------------|
    | SILVER          | 0.3%                         | [0, 500]              |  23.05.2020    | 5000                  |
    |                 | 0.2%                         | (500, 5000]           |                |                       |
    | GOLD            | 0.6%                         | [0, 500]              |  05.07.2020    | 700                   |
    |                 | 0.4%                         | (500, 5000]           |                |                       |
    | PLATINUM        | 0.9%                         | [0, 500]              |  15.03.2020    | 300                   |
    |                 | 0.5%                         | (500, 5000]           |                |                       |

Where each interest rate applies for the corresponding interval of money.
E.g., A Silver account with 600 RON on it will produce 0.3% * 500 RON + 0.2% * 100 RON after one year. 
    
4. Current date and time is: *19th March, 2019 - 11:30*

**Please write an application using either Java or C# programming language in order to:**

2. <h5>Subject code = INT05 </h5>
 Distribute the money in the 3 available accounts such that you will get the maximum interest rate,
 based on the rate percentage and available amount on each account.
 
 Also, compute and print what would be the total amount available in all accounts after the money has been 
 redistributed and 39 months have passed. 
 
 The application should implement the following method:

    public List<Account> redistributeMoney(List<Account> accounts) {
        // TODO: add your code here
    }

**Note:**

1. *All dates are in the same timezone.*
2. *Only specified constraints are to be taken in consideration.*
3. *The application should work for any set of similar input.*
4. *Processing time is negligible for transferring and withdrawing the money*
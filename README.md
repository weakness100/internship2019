# Internship 2019

<h1>Bring me the money</h1>

**Given a user situated in location A, and 4 ATMS such that:**
1. The distance from userA to each ATM is:
    1. 5m to ATM 1
    2. 1h to ATM2
    3. 30m to ATM3
    4. 45m to ATM4
2. The distance between ATMs is:
    1. From ATM 1 -> ATM 2: 40m
    3. FROM ATM 1 -> ATM 4: 45m
    4. FROM ATM 2 -> ATM 3: 15m
    5. FROM ATM 3 -> ATM 1: 40m
    6. FROM ATM 3 -> ATM 4: 15m
    7. FROM ATM 4 -> ATM 2: 30m

3. Each ATM has the same amount of money (5k), and:

    | ATM Name | Opening time | Closing time |
    |----------|--------------|--------------|
    | ATM 1    | 12:00        | 18:00        |
    | ATM 2    | 10:00        | 17:00        |
    | ATM 3    | 22:00        | 12:00        |
    | ATM 4    | 17:00        | 01:00        |

4. User has 3 credit cards:

    | Credit card | Fee  | Withdraw limit | Expiration date| Available Amount |
    |-------------|------|----------------|----------------|------------------|
    | SILVER      | 0.2% | 2k             | 23.05.2020     | 20k              |
    | GOLD        | 0.1% | 3k             | 15.08.2018     | 25k              |
    | PLATINUM    | 0%   | 4k             | 20.03.2019     | 3k               |

5. Current date and time is: *19th March, 2019 - 11:30*

**Please write an application using Java/C# that:**
1. Determines what ATMs the user needs to use in order to withdraw 7.5k amount until 14:00 time with smallest fee available,
using only valid credit cards (that are not expired at the current date),
without passing through the same location twice.
Processing time for each ATM is negligible.

The application should implement the following method:

    public List<Atm> getAtmsRoute() {
        // TODO: add your code here
    }


**Note:**

*All dates are in the same timezone.*


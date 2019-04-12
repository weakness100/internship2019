**Subject code = INT03**

An employee has an employment start date, an employment end date and contractual holiday rights per year.
The contractual holiday rights are initially set at 20 days.
Each year the contractual holiday rights increases with 1 day until the max of 24 days.

The contracts can be suspended during specific periods of time. During the suspension period, the holiday rights will not be applied.
This means that if the employment start date is 2019-01-01 and the employment end date is 2019-12-31 and between 2019-03-01 and
2019-08-31 the employee is suspended, then for 2019, the employee has only 10 days of holiday.

Having as input the employment start date, employment end date and a list of suspension periods, compute the actual holiday rights 
for the employee per year. 

**Please write an application using either Java or C# programming language.**

The application will read from a file named **input.json** having the following structure:
```json
{
  "employeeData": {
  "employmentStartDate": "yyyy-MM-dd", 
  "employmentEndDate": "yyyy-MM-dd",
  "suspensionPeriodList": [
         {"startDate":  "yyyy-MM-dd", "endDate":  "yyyy-MM-dd" },
         {"startDate":  "yyyy-MM-dd", "endDate":  "yyyy-MM-dd" }
   ]
  }
}
```

You have to validate input data.

The application will write the result in a file named **output.json** having the following structure:
```json
{
"output": {
   "errorMessage" : "string",
   "holidayRightsPerYearList":[
     {"year": "yyyy", "holidayDays": "number"},
     {"year": "yyyy", "holidayDays": "number"}
   ]
 }
}
```

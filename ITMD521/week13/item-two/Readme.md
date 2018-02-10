## Item-TWO: SQL Job

### Analysis of the Entire query for two log files are:

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week13/item-two/Analysis.PNG)

On an Average time taken to run the query for two log files in two cases is 6 seconds.
Time taken to Run the large log file for index.*per day is the highest i.e 9.32 seconds

### 1. The most frequently visted WebPage (URL) with a 200 return code that is not index.* per month
 ##### For small.log file are using query shown in Snapshot below:
 ![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week13/item-two/small_month.png)
  ##### For Large.log file are using query shown in Snapshot below:
  ![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week13/item-two/large_month.PNG)
  
  ### 2. The most frequently visted WebPage (URL) with a 200 return code that is not index.* per day
 ##### For small.log file are using query shown in Snapshot below:
 ![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week13/item-two/small_day.png)
  ##### For Large.log file are using query shown in Snapshot below:
  ![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week13/item-two/large_day.PNG)
 
 
### Steps to follow:
1.Created a Database and use that databasein mysql : 
     
       CREATE DATABASE item2;
        USE item2;
        Create table named smalllog and largelog
2.Created a java class named "item2.java(https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week13/item-two/item2.java)" which consist of four methods which is used to pass the data to the sql database.
3. Run the query shown above in the screenshots

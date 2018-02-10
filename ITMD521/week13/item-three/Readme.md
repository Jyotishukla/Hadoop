## Item-Three: Sqoop Job

#### Imported the data from the SQL table using sqoop import:
      sqoop import --connect jdbc:mysql://127.0.0.1/item2 --username root --jyoti root --table logstable --m 1
      
Execute the query to see the index.* per day:

      sqoop import --connect jdbc:mysql://127.0.0.1/item2 --username root --jyoti root --query 'select substr(logtable,6,2) as date, uri, 
      count(uri) as url from logtable where $CONDITIONS AND status='200' group by date, uri order by url DESC LIMIT 19;' --m 1 
      --target-dir /user/$USER/item3/

Execute the query to see the index.* per month:

      sqoop import --connect jdbc:mysql://127.0.0.1/item2 --username root --jyoti root --query 'select substr(logtable,6,2) as Month, uri, 
      count(uri) as url from logtable where $CONDITIONS AND status='200' group by Month, uri order by url DESC LIMIT 19;' --m 1 
      --target-dir /user/$USER/item3/

## Ease of gathering, processing, and wrtting code to retrieve data

### Mapreduce: 
It is easy to concat the log files and transfer into a .log file to use as a input for Mapreduce Job.
For gathering the data from the Local system to HDFS is not to complex. It just a matter of two steps shown below:

      Copy the large data file to HDFS system
      hadoop fs -copyFromLocal /vagrant_data/item1/largelog /user/$USER/item1/largelog.log

      Copy the smaller data file to HDFS system
      hadoop fs -copyFromLocal /vagrant_data/item1/smalllog /user/$USER/item1/smalllog.log

  Processing the data:

1. Created some Java Classes for Mapping and Reducing the large and small data sets.
2. Complied the java classes and create a jar of all the classes

On an average, it took 3 minutes to complete a task.
Time taken to complete the task depends on the size of the datasets as well as the type of the datasets.
It is little difficult to understand the background processes in Mapreduce as compare to SQL and Hive.

#### SQL:
To gather the data in SQL we just have to write a java class in which it will connect to the JDBC and our SQLServer.
In my Java class for item-Two, I have created four Methods, in which two methods is to pass the data to the database for both the log files through .csv file(data_large.csv and data_small.csv) created on the class.
 
To gather and process the data sql from the zip is easy as compare to all other methods.
I imported all the data from that .csv file to my table in sql from that Java class and simply by using firing query i got
the resut as expected.
 
For processing and retriving data, Sql took the lesser time as compare to other methods. On an average, In SQL it took 6 seconds to run the query which is the lowest as compare to other methods.
 
### Sqoop:
Sqoop interacts with both the database source and Hadoop. we copied the log file in our local system in csv format to run the jar file.Like Hadoop itself, Sqoop is written in Java. Java provides an API
called Java Database Connectivity, or JDBC, it allows to take data from the local system as well as to analyze the data. 

### Hive: 
To gather the data from the log file i simply used a scoop import statement which helps me to import all the data from the SQL table 
to my local system in csv format.

      for smalllog data set
      sqoop import --connect jdbc:mysql://localhost/logs --table smalllog -m 1

      for Large log set:
      sqoop import --connect jdbc:mysql://localhost/logs --table largelog -m 1

By using this scoop command, this will craete a coppy of largelog and smalllog into HDFS system. Copy the file from HDFS to 
Local system.

      for small log set:
      hadoop fs -copyToLocal /user/$USER/smalllog/part-m-00000 /vagrant_data/hive/smalllog.log 
(created hive folder in vagrant data and same for largelog)

      for large log set:
      hadoop fs -copyToLocal /user/$USER/largelog/part-m-00000 /vagrant_data/hive/largelog.log 
(created hive folder in vagrant data and same for largelog)

created table in Hive as we did in SQL. and Load the table by using command:

     LOAD DATA LOCAL INPATH "/vagrant_data/hive/smalllog.log" INTO TABLE smalllog; (same for large table)

Simply, by firing query we can get our result. WHich is as same as SQL. Just some difference with pattern of query.
Hive is compatible with SQL as well as sqoop. 
It is efficent and convienent to use for the large amount of data because lesser time as copare to sqoop and Mapreduce.

### Pig: 
For Pig Latin script, i copied the datasets into hdfs with the extension .txt and wrote 5 pig file which is of a simple query
and in that query i load the data from the HDFS system and the query works as same as SQL but little bit complex query.
Pig is a source alternative of Mapreduce, it approaches the complementary components on Hadoop.

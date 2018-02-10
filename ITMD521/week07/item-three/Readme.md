## Analysis for 3 different Datasets(txt, bz2 and gz) with MaxTemperature.java file:

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/Analysis_1.PNG)

### As we can see that the time taken for each dataset is increasing gradually irrespect of type of the file but we can ntoice that the gunzip file is usually taking higher time then other type of files but it is highly efficent than txt or bz2 type.


## Analysis for 3 different Datasets with MaxTemperatureWithCombiner.java file:

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/Analysis_2.PNG)

### As we can see that the time taken for each dataset is increasing gradually irrespect of type of the file but we can ntoice that the gunzip file is usually taking higher time.

### But with the combiner each dataset is taking less time as compare to without combiner. With combiner it decreases the time to complete the job by 1.5 times.

##### Dataset-1- 1990.txt with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0177 <br>
Number of Maps: 63 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:13 Minutes 13 Seconds

![alt tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-1990tx.png)

##### Dataset-1- 1990.txt.bz2 with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0179 <br>
Number of Maps: 5 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:12 Minutes 13 Seconds
![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-1990bz.png)

##### Dataset-1- 1990.txt.gz with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0182 <br>
Number of Maps: 3 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:13 Minutes 13 Seconds


##### Dataset-2- 1990and1992.txt with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0190 <br>
Number of Maps: 132 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:14 Minutes 4 Seconds

![alt tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-9092tx.png)

##### Dataset-2- 1990and1992.txt.bz2 with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0193 <br>
Number of Maps: 10 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:15 Minutes 7 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-9092txbz.png)

##### Dataset-2- 1990and1992.txt.gz with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0196 <br>
Number of Maps: 1 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:32 Minutes 15 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-9092txgz.png)


##### Dataset-3- 90919293.txt with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0190 <br>
Number of Maps: 269 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:34 Minutes 45 Seconds

![alt tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-90-93tx.png)

##### Dataset-3- 90919293.txt.bz2 with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0210 <br>
Number of Maps: 20 <br>
Number of reduce: 1 <br>
Total Time taken to run the job: 7 Minutes 38 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-90-93txbz.png)

##### Dataset-3- 90919293.txt.gz with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0214 <br>
Number of Maps: 1 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:22 Minutes 6 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-90-93txbz.png)



## With Combiner:


##### Dataset-1- 1990.txt with MaxTemperatureWithCombiner:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0475 <br>
Number of Maps: 63 <br>
Number of reduce: 1 <br>
Total Time taken to run the job: 2 Minutes 13 Seconds

![alt tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-1990txc.png)



##### Dataset-1- 1990.txt.bz2 with MaxTemperatureWithCombiner:


Job run on: 19-march-2017 <br>
Job ID: job_1488468764052_2814 <br>
Number of Maps: 5 <br>
Number of reduce: 1 <br>
Total Time taken to run the job: 6 Minutes 15 Seconds
![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-1990gzc.png)

##### Dataset-1- 1990.txt.gz with MaxTemperatureWithCombiner:


Job run on: 19-march-2017 <br>
Job ID: job_1488468764052_2812 <br>
Number of Maps: 3 <br>
Number of reduce: 1 <br>
Total Time taken to run the job: 3 Minutes 13 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-1990gzc.png)


##### Dataset-2- 1990and1992.txt.bz2 with MaxTemperatureWithCombiner:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_2875 <br>
Number of Maps: 10 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:15 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-9092bzc.PNG)

##### Dataset-2- 1990and1992.txt.gz with MaxTemperature:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_0196 <br>
Number of Maps: 1 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:17 Minutes 45 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-9092gzc.PNG)

##### Dataset-3- 90919293.txt.bz2 with MaxTemperatureWithCombiner:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_2879 <br>
Number of Maps: 20 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:10 Minutes

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-90-93bzc.PNG)

##### Dataset-3- 90919293.txt.gz with MaxTemperatureWithCombiner:


Job run on: 4-march-2017 <br>
Job ID: job_1488468764052_2878 <br>
Number of Maps: 1 <br>
Number of reduce: 1 <br>
Total Time taken to run the job:30 Minutes 45 Seconds

![alt_tag](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week07/item-three/521-item3-90-93gzc.PNG)












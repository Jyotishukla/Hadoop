##ITMD 521 – Week-05-I/O                     

Modified, compiled and executed the MapReduce jobs on a local system and remote cluster
####Steps:
1. Concerted all the .txt files into a file called all-sotu.txt by using command in /vagrant_data :
      Cat 1796-sotu.txt 1993-sotu.txt 1997-sotu.txt 2001-sotu.txt 2005-sotu.txt 2009-sotu.txt 2013-sotu.txt >> all-sotu.txt
2. Copy the WordCount.java and WordCount2.java in the local system /Ubuntu-xenial-large-521/data/
3. Create a file named patterns.txt which contains all the prepositions of the English Language
4. Start the Vagrant by using command: vagrant up
5. We assume that Hadoop-2.5.2 is installed in the vagrant and all the path is defined.\
6. Start all the services by using command :
        a. start-dfs.sh
        b. start-yarn.sh
        c. mr-jobhistory-daemon.sh start historyserver
7. And check that all 7 services are started or not by using command: jps
####Part-1:
1. Copy the pattern.txt and all-sotu.txt files in the Hadoop file system by using commands:
        a. hadoop fs -mkdir -p /user/$USER/input- created a folder for input
        b. hadoop fs -mkdir -p /user/$USER/output- created a folder for output
        c. hadoop fs -put /vagrant_data/pattern.txt /user/$USER/input – Copying the pattern.txt file in input folder
        d. hadoop fs -put /vagrant_data/all-sotu.txt /user/$USER/input – Copying the al-sotu.txt files in input folder.
2. Compile the java files i.e. WordCount.java and WordCoutn2.java by using command: hadoop com.sun.tools.javac.Main *.java and then create a jar file of this java classes named wc.jar by using command: jar cf wc.jar *.class
3. Run the application and store the result in output folder which is created in previous step by using command: hadoop jar wc.jar WordCount /user/$USER/input /user/$USER/output/part01
and copy the part1 result set into local system data folder by using command: hadoop fs -put /user/$USER/output/part1 /vagrant_data/
4. Sorting the top ten words from the resultset by using command:
      sort -n -k1.4 /vagrant_data/part1/part-r-00000 | tail -15
Hence, we are done with part 1

####Part-02:
1. Run the application and store the result in the output folder by using command: hadoop jar wc.jar WordCount2 /user/$USER/input /user/$USER/output/part02
and copy the part02 result set into local system data folder by using command: hadoop fs -put /user/$USER/output/part02 /vagrant_data/
2. Sorting the top ten words from the resultset by using command:
        sort -n -k1.4 /vagrant_data/part2/part-r-00000 | tail -15
Hence, we are done with part 2

####Part-03:
1. Modifying the WordCount.java to look for only words that occur only four times as shown below:
2. Remove the old jar files and all .class files and compile the java classes again : hadoop com.sun.tools.javac.Main *.java and then created a jar file of this java classes named wc.jar by using command: jar cf wc.jar *.class
3. Run the application and store the result in the output folder by using command: hadoop jar wc.jar WordCount /user/$USER/input /user/$USER/output/part03
and copy the part03 result set into local system data folder by using command: hadoop fs -put /user/$USER/output/part03 /vagrant_data/
4. Sorting the top ten words from the resultset by using command:
        sort -n -k1.4 /vagrant_data/part3/part-r-00000 | tail -15
Hence, we are done with part 3

####Part-04:
1. By using application WordCount2, we will skip all the prepositions from the all-sotu.txt file by using command: hadoop jar wc.jar WordCount2 -Dwordcount.case.sensitive=false /user/$USER/input/all-sotu-txt /user/$USER/ouput/part04/ -skip /user/$USER/input/pattern.txt
2. Copy the part04 result set into local system data folder by using command:
              hadoop fs -put /user/$USER/output/part04 /vagrant_data/
3. Sorting the top ten words from the resultset by using command:
              sort -n -k1.4 /vagrant_data/part4/part-r-00000 | tail -15
Hence, we are done with part 4.

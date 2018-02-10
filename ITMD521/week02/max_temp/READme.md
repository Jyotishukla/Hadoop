#Instructions to run the program:

Using the same datasets and the schema provided in the beginning of chapter 
We developed a java program that will parse the datasets and insert them into 3 tables in a mysql database(professor_02).
The root password combo for mysql is: safestsystemever

Create a Schema named "professor_02" in the mysql server and use this professor_02 for further steps.

<Steps:>
1. Copy the eclipse project into the ubuntu/trusty64 folder.<br>
2. By using power shell, Start the Vagrant by using command : <b>vagrant up</b><br>
3. Start the ubuntu machine by using command <b>vagrant ssh</b><br>
![snap1] (https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week02/images/1.PNG)
4. Navigate to home directory by using comand <b>cd / </b><br>
5. Change directory to /vagrant in home directory: where we can see our project named "max_temp"<br>
6. Copy all the .gz files in thr src folder of the project, so that we can get the dataset.<br>
7. Compile the project by navigating to the directory src by using command <b>javac max_temp/Max_temperature.java</b><br>
8. Run the project by using command <b>java max_temp/Max_temperature</b><br>

<b>After running the program, Options will be present to execute the different datasets</b>
![snap1](https://github.com/illinoistech-itm/jshukla3/blob/master/ITMD521/week02/images/3.PNG)

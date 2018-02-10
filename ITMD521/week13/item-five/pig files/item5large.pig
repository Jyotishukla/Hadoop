log = LOAD 'itme5/largelog.txt' USING PigStorage(',') AS (idlog, date1, date2, URL, method); 
perday1 = GROUP log by (date1,URL);
perday2= FOREACH perday1 GENERATE group,COUNT(log) AS num;
perday3= GROUP perday2 by group.date1;
perdaymax = FOREACH perday3 {
SA = ORDER perday2 BY num DESC;
SB = LIMIT SA 1;
GENERATE FLATTEN(SB.group);}
DUMP perdaymax;

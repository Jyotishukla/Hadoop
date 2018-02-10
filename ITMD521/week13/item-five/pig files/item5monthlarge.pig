log = LOAD 'itme5/largelog.txt' USING PigStorage(',') AS (idlog, date1, date2, URL, method);
permonth1 = GROUP log by (date2,URL);
permonth2= FOREACH permonth1 GENERATE group,COUNT(log) AS num;
permonth3= GROUP permonth2 by group.date2;
permonthmax = FOREACH permonth3 {
SA = ORDER permonth2 BY num DESC;
SB = LIMIT SA 1;
GENERATE FLATTEN(SB.group);}
DUMP permonthmax;

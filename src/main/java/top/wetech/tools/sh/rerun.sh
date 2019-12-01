#!/bin/bash

# set the start and end date, then the date from start to end as a param set to the hql file.
start_date='2019-11-05'
end_date='2019-11-12'
duration=$((($(date +%s -d $end_date) - $(date +%s -d $start_date))/86400))

for((i=1;i<=$duration;i++));
do
    etl_date=`date -d "$start_date +$i days" +%Y-%m-%d`
    echo "etl date is $etl_date"
    hive -hivevar dt=$etl_date -f tmp.hql
done
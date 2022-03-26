create table t1 as select trunc((rownum-1)/100) id, 
r_pad(rownum,100) t_pad from DBA_SOURCE
where rownum<= 10000;

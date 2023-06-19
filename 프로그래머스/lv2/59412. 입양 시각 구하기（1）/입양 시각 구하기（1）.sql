-- 코드를 입력하세요
select to_number(to_char(datetime,'hh24'))as hour, count(*)
  from animal_outs
 where to_number(to_char(datetime,'hh24'))>=9 
   and to_number(to_char(datetime,'hh24'))<=19
 group by to_number(to_char(datetime,'hh24'))
 order by hour;
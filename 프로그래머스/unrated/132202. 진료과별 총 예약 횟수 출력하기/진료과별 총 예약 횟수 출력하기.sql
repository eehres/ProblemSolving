-- 코드를 입력하세요
select mcdp_cd
     , count(mddr_id)
  from appointment
 where to_char(apnt_ymd,'yyyymmdd') like '202205%'
 group by mcdp_cd
 order by count(mddr_id) asc, mcdp_cd asc
;
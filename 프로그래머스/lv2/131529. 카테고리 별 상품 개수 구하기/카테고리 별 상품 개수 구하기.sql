-- 코드를 입력하세요
select substr(product_code,1,2) as category
     , count(*)
  from product
 group by substr(product_code,1,2)
 order by category asc;
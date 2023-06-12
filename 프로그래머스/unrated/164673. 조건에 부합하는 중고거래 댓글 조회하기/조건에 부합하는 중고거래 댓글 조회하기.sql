-- 코드를 입력하세요
select ugb.title
     , ugb.board_id
     , ugr.reply_id
     , ugr.writer_id
     , ugr.contents
     , to_char(ugr.created_date,'YYYY-MM-DD')
  from used_goods_board ugb
 inner join used_goods_reply ugr
    on ugb.board_id = ugr.board_id
 where ugb.created_date between to_date('2022-10-01', 'yyyy-mm-dd') and to_date('2022-10-31', 'yyyy-mm-dd')
 order by ugr.created_date asc, ugb.title asc
 ;
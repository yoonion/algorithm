select b.title, b.board_id, r.reply_id, r.writer_id, r.contents, date_format(r.created_date, '%Y-%m-%d')
from USED_GOODS_BOARD b join USED_GOODS_REPLY r on b.board_id = r.board_id
where b.created_date like '2022-10%'
order by r.created_date, b.title

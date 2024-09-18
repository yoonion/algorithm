select concat('/home/grep/src/', b.board_id, '/', file_id, file_name, file_ext) as file_path
from USED_GOODS_BOARD b join USED_GOODS_FILE f on b.board_id = f.board_id
where b.views in (
    select max(views)
    from USED_GOODS_BOARD
)
order by file_id desc
select id, ifnull(
    (select count(*) from ECOLI_DATA group by parent_id having parent_id = id), 0
) as child_count
from ECOLI_DATA
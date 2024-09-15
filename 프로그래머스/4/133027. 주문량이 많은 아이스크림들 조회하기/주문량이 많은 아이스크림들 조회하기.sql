select A.flavor 
from (
    select * from first_half
    union
    select * from july
) as A
group by A.flavor
order by sum(A.total_order) desc
limit 3
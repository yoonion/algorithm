select hour(datetime) as hour, count(*) as count
from ANIMAL_OUTS
group by hour
having hour >=9 and hour <= 19
order by hour

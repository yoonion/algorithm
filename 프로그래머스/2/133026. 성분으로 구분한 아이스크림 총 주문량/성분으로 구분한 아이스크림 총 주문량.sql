select INGREDIENT_TYPE, SUM(TOTAL_ORDER) as TOTAL_ORDER
from first_half f join icecream_info i on f.flavor = i.flavor
group by INGREDIENT_TYPE
order by total_order

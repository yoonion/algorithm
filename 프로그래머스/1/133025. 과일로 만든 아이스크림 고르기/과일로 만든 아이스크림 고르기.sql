select i.flavor
from first_half f join icecream_info i on f.flavor = i.flavor
where f.total_order > 3000 and i.INGREDIENT_TYPE = 'fruit_based'
order by f.total_order desc

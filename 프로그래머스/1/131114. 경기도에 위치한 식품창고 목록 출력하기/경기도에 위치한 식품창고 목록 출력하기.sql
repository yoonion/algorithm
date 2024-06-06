select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, ifnull(FREEZER_YN, "N")
from FOOD_WAREHOUSE 
where address like "경기도%"
order by WAREHOUSE_ID
select date_format(SALES_DATE, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount
from ONLINE_SALE
where sales_date like '2022-03%'
union
select date_format(SALES_DATE, '%Y-%m-%d') as sales_date, product_id, null as user_id, sales_amount
from OFFLINE_SALE
where sales_date like '2022-03%'
order by sales_date, product_id, user_id
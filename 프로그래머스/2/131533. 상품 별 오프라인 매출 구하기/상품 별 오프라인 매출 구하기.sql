select p.product_code, sum(sales_amount * price) as sales
from product p join offline_sale o on p.product_id = o.product_id
group by o.product_id
order by sales desc, p.product_code
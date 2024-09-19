SELECT category, price AS max_price, product_name
FROM FOOD_PRODUCT
WHERE (category, price) IN (
    SELECT category, MAX(price)
    FROM FOOD_PRODUCT
    WHERE category IN ('과자', '국', '김치', '식용유')
    GROUP BY category
)
order by max_price desc
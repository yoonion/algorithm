select car_type, count(*) as cars
from CAR_RENTAL_COMPANY_CAR
where options like '%통풍%' or options like '%열선%' or options like '%가죽%'
group by car_type
order by car_type
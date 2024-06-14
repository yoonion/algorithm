select history_id, car_id, date_format(start_date, '%Y-%m-%d'), date_format(end_date, '%Y-%m-%d'), 
    case 
        when datediff(end_date, start_date) + 1 >= 30 then '장기 대여'
        when datediff(end_date, start_date) + 1 < 30  then '단기 대여'
    end as rent_type
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date like '2022-09%'
order by history_id desc

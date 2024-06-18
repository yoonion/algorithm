select
    case 
        when month(DIFFERENTIATION_DATE) <= 3 then '1Q'
        when month(DIFFERENTIATION_DATE) <= 6 then '2Q'
        when month(DIFFERENTIATION_DATE) <= 9 then '3Q'
        when month(DIFFERENTIATION_DATE) <= 12 then '4Q'
    end as quarter,
    count(*) as ecoli_count
from ecoli_data
group by quarter
order by quarter
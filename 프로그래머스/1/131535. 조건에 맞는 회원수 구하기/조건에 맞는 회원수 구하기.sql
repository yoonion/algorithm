select count(*) as users
from user_info
where age >= 20 and age <= 29 and joined like '2021%'
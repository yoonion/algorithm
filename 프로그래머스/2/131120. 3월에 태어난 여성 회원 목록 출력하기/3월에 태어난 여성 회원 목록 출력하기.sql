select member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as date_of_birth
from member_profile
where gender='W' and date_of_birth like '%-03-%' and tlno is not null
order by member_id
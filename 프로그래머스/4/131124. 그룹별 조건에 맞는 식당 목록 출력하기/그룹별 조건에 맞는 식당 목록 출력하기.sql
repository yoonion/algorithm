select m.member_name, r.review_text, date_format(r.review_date, '%Y-%m-%d') as date_of_birth
from member_profile m join rest_review r on m.member_id = r.member_id
where m.member_id = (
    select member_id 
    from rest_review 
    group by member_id 
    order by count(*) desc 
    limit 1     
)
order by date_of_birth, r.review_text


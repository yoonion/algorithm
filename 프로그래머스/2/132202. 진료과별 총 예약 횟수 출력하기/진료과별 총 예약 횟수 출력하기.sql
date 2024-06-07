select mcdp_cd as 진료과코드, count(*) as 5월예약건수
from APPOINTMENT
where apnt_ymd like '2022-05%'
group by mcdp_cd
order by COUNT(MCDP_CD), mcdp_cd
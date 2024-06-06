select ANIMAL_TYPE, ifnull(NAME, 'No name'), SEX_UPON_INTAKE
from animal_ins
order by animal_id
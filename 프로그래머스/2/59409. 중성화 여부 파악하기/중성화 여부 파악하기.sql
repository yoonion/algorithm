select animal_id, name, IF(SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE '%SPAYED%', 'O', 'X') AS '중성화'
from animal_ins
order by animal_id
select o.animal_id, o.name
from animal_outs o left outer join animal_ins i on o.animal_id = i.animal_id
where i.animal_id is null
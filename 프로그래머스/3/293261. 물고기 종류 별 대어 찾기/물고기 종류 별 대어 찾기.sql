select fi.id, fni.fish_name, fi.length as length
from fish_info fi join fish_name_info fni on fi.fish_type = fni.fish_type
where (fi.fish_type, fi.length) in (select fish_type, max(length) from fish_info group by fish_type)
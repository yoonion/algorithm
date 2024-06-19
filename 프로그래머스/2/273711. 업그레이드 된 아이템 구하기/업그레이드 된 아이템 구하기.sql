SELECT ii.item_id, ii.item_name, ii.rarity
FROM item_info ii JOIN item_tree it ON ii.item_id = it.item_id
WHERE parent_item_id IN (SELECT item_id FROM item_info WHERE rarity = 'RARE')
ORDER BY ii.item_id desc
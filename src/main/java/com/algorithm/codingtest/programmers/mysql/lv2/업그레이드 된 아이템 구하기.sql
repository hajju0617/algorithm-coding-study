SELECT II.ITEM_ID, II.ITEM_NAME, II.RARITY
FROM ITEM_INFO II
INNER JOIN ITEM_TREE IT
ON II.ITEM_ID = IT.ITEM_ID
WHERE PARENT_ITEM_ID IN (
                            SELECT ITEM_ID
                            FROM ITEM_INFO
                            WHERE RARITY = 'RARE'
                        )
ORDER BY II.ITEM_ID DESC;
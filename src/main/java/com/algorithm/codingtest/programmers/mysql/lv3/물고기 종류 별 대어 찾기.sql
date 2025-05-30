SELECT FI.ID, FNI.FISH_NAME, LENGTH
FROM FISH_INFO FI
INNER JOIN FISH_NAME_INFO FNI
ON FI.FISH_TYPE = FNI.FISH_TYPE
WHERE (FI.FISH_TYPE, LENGTH) IN (
                                SELECT FISH_TYPE, MAX(LENGTH)
                                FROM FISH_INFO
                                GROUP BY FISH_TYPE
                                )
ORDER BY FI.ID ASC;
SELECT CASE WHEN MONTH(DIFFERENTIATION_DATE) IN (1, 2, 3) THEN '1Q'
            WHEN MONTH(DIFFERENTIATION_DATE) IN (4, 5, 6) THEN '2Q'
            WHEN MONTH(DIFFERENTIATION_DATE) IN (7, 8, 9) THEN '3Q'
            ELSE '4Q'
    END AS QUARTER
     , COUNT(ID) AS ECOLI_COUNT
FROM ECOLI_DATA
GROUP BY QUARTER
ORDER BY QUARTER ASC


-- CASE WHEN 사용하지 않고.
SELECT
        CONCAT(FLOOR((MONTH(DIFFERENTIATIONDATE)-1)/3)+1,'Q') as QUARTER
      , COUNT(*) AS ECOLICOUNT
FROM ECOLI_DATA
GROUP BY QUARTER
ORDER BY QUARTER
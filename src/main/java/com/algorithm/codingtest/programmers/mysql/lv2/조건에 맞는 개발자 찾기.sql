SELECT DEV.ID, DEV.EMAIL, DEV.FIRST_NAME, DEV.LAST_NAME
FROM DEVELOPERS DEV
WHERE SKILL_CODE & (
                    SELECT CODE
                    FROM SKILLCODES
                    WHERE NAME = 'C#'
                    ) != 0
   OR SKILL_CODE & (
                    SELECT CODE
                    FROM SKILLCODES
                    WHERE NAME = 'Python'
                   ) != 0
ORDER BY DEV.ID ASC
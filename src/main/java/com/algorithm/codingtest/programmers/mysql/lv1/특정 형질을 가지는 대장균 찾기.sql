SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 2 = 0 AND (GENOTYPE & 1 = 1 OR GENOTYPE & 4 != 0)


/*
    & 연산자 : 두 숫자의 대응하는 비트가 모두 1일 때만 결과 비트가 1이 됨.
    Ex) SELECT 6 & 3;   // 결과 2
        6의 2진수 : 110
        3의 2진수 : 011
        6 & 3의 결과는 010 (즉, 2)

        SELECT 5 & 4    // 결과 4
        5의 2진수 : 101
        4의 2진수 : 100
        5 & 4의 결과는 100 (즉, 4)
*/
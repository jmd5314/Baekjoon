SELECT a.ANIMAL_ID,a.ANIMAL_TYPE,a.NAME
FROM ANIMAL_INS a
JOIN ANIMAL_OUTS b
ON a.ANIMAL_ID = b.ANIMAL_ID
WHERE a.SEX_UPON_INTAKE LIKE 'Intact%'
AND( b.SEX_UPON_OUTCOME LIKE 'Spayed%' OR b.SEX_UPON_OUTCOME LIKE 'Neutered%')
ORDER BY a.ANIMAL_ID
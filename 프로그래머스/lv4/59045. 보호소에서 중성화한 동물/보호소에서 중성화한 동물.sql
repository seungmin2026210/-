-- 코드를 입력하세요

select i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
from ANIMAL_INS i left join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where i.SEX_UPON_INTAKE != o.SEX_UPON_OUTCOME;




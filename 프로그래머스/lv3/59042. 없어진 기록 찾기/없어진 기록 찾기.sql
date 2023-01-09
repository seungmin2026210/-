-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.NAME
from ANIMAL_INS i right join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where o.ANIMAL_ID not in ( select i.ANIMAL_ID
                           from ANIMAL_INS i join ANIMAL_OUTS o
                           on i.ANIMAL_ID = o.ANIMAL_ID)
order by i.ANIMAL_ID;
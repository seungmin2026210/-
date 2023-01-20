-- 코드를 입력하세요
SELECT h.FLAVOR
from FIRST_HALF h join JULY j
on h.FLAVOR  = j.FLAVOR 
group by h.FLAVOR
order by sum(h.TOTAL_ORDER) + sum(j.TOTAL_ORDER) desc limit 3;

-- 코드를 입력하세요
SELECT CAR_TYPE, count (CAR_ID) as CARS
from CAR_RENTAL_COMPANY_CAR 
where OPTIONS like '%열선%' OR OPTIONS like '%통풍%' OR OPTIONS like '%가죽%'
group by CAR_TYPE
order by CAR_TYPE

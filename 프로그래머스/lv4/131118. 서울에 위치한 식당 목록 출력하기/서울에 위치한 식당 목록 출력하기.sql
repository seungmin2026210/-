-- 코드를 입력하세요
SELECT i.REST_ID, i.REST_NAME,i.FOOD_TYPE,i.FAVORITES,i.ADDRESS,
ROUND(avg(r.REVIEW_SCORE),2) as SCORE
from REST_INFO i join REST_REVIEW r 
on r.REST_ID = i.REST_ID
where ADDRESS like '서울%'
group by i.ADDRESS
order by SCORE desc, i.FAVORITES desc; 
-- 코드를 입력하세요
SELECT year(s.SALES_DATE) AS YEAR, month(s.SALES_DATE) AS MONTH, i.GENDER, count(distinct s.USER_ID) AS USERS
from USER_INFO i join ONLINE_SALE s
on i.USER_ID = s.USER_ID
where GENDER is not null
group by year(s.SALES_DATE), month(s.SALES_DATE), GENDER
order by year(s.SALES_DATE), month(s.SALES_DATE), GENDER;

SELECT CATEGORY, PRICE as "MAX_PRICE", PRODUCT_NAME
from FOOD_PRODUCT 
where CATEGORY in ('과자','김치','식용유','국') and PRICE in (select max(PRICE)
                                                             from FOOD_PRODUCT
                                                             group by CATEGORY)
group by CATEGORY
order by PRICE desc;
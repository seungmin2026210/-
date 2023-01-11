-- 코드를 입력하세요
SELECT ID, NAME, HOST_ID
from PLACES
where host_id in (select host_id
                 from places
                 group by host_id
                 having count(host_id)>=2)
order by ID;
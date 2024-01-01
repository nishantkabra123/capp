[Yesterday 7:57 PM] Nishant Kabra
I have completed my code changes for the first 2 API. I have to test it. 
[Yesterday 7:57 PM] Nishant Kabra
I have also informed the team for review

create an API to fetch only 4 rows of each Filter name from the filter default table.
create an API to fetch 5 fields from parent and 5 from child tables.
 fetch the values based on offerId(separate the values having comma separated with the list<String> as output ).


create an API to fetch only 4 rows of each Filter name from the filter default table --
 
SELECT * FROM ( SELECT *, ROW_NUMBER() OVER (PARTITION BY user_id ORDER BY start_date ASC) AS row_number FROM rover_filter_default ) t WHERE t.row_number = 1
 
create an API to fetch 5 fields from parent and 5 from child tables --
 
select pr.promo_request_id,pr.promo_name,pr.offer_id,pr.offer_desc,pr.status,pbr.PROMO_BRIEF_REQUEST_ID,pbr.DEVICES,pbr.ELIGIBILE_ORDER,pbr.STACKABILITY,pbr.ELIGIBILE_SEGMENT from promo_request pr inner join promo_brief_request pbr on pr.promo_request_id=pbr.promo_request_id

 
10:40
Currently, I am working on the Repository Layer and developing the DB Query
10:40
I have completed other changes


select pr.promo_request_id,pr.promo_name,pr.offer_id,pr.offer_desc,pr.status,pbr.PROMO_BRIEF_REQUEST_ID,pbr.DEVICES,pbr.ELIGIBILE_ORDER,pbr.STACKABILITY,pbr.ELIGIBILE_SEGMENT from promo_request pr inner join promo_brief_request pbr on 
pr.promo_request_id=pbr.promo_request_id

I am creating an API to fetch only 4 rows of each Filter name from the filter default table.

I needed help with the DB Query
 I tried using the below Query

SELECT *
FROM (
 SELECT
     *,
     ROW_NUMBER() OVER (PARTITION BY user_id
     ORDER BY start_date ASC) AS row_number
 FROM rover_filter_default
) t
WHERE t.row_number = 1






My DB Access status is Work In Progress on AYS. Once completed I will let you know

I saw commits for the PricePlan changes, Offer Filters and Plan Group of my co-workers.

Hi, I have a request
yasotha.lakshapathy

As I am implementing solutions on new system, it would be helpful if we can skip my task for tomorrow.


Hi, I found this Log API in the About section - rover-pricing/api/LogUserActivity
Are you aware of the Jira Ticket Number for this feature






So I can understand how to be effective. It will help reduce errors and increase the efficiency.
11:14
I can be ready and continue as usual from Monday.


11:14
As I am implementing solutions on new system, it would be helpful if we can skip my task for tomorrow.
11:14
So I can understand how to be effective. It will help reduce errors and increase the efficiency.
11:14
I can be ready and continue as usual from Monday.

As I am implementing solutions on new system, it would be helpful if we can skip my task for tomorrow so I can understand how to be effective. It will help reduce errors and increase the efficiency. I can be ready and continue as usual from Monday

 I got to know more about the application and functionalities.
Now I am exploring the module and recent commits in the release

[Yesterday 11:06 PM] Nishant Kabra
I discussed with Rashmi about the project. She gave me the KT
[Yesterday 11:06 PM] Nishant Kabra
We talked about the subqueries and the application configuration and the DB calls from the service layer
[Yesterday 11:07 PM] Nishant Kabra
I will use the guidelines in my next tasks
API Endpoint -
http://localhost:8083/rover-pricing/fetchAllPromoRequests

Ganesh Srinivasan <ganesh.srinivasan@verizon.com>,
Yasotha Lakshapathy <yasotha.lakshapathy@verizon.com>,
nilesh.sharma@creospan.com
cc:	Rohit Kotha <rohith.kotha@verizon.com

Previously the data was unavailable in the response. I have fixed this issue using enhanced for loop. I am getting the below response for UAT data.

API Endpoint -
http://localhost:8083/rover-pricing/fetchAllPromoRequests
Response recieved -
[
    {
        "PromoName": null,
        "AssignedTo": "RA TEAM",
        "CreatedOn": "2023-12-12 18:31:40",
        "Status": "In Progress",
        "PlannedRelease": null,
        "CompletedOn": null
    },
    {
        "PromoName": "test promo 3",
        "AssignedTo": "RA TEAM",
        "CreatedOn": "2023-12-12 23:00:54",
        "Status": "In Progress",
        "PlannedRelease": null,
        "CompletedOn": null
    },
    {
        "PromoName": "test promo 3",
        "AssignedTo": "RA TEAM",
        "CreatedOn": "2023-12-12 23:01:33",
        "Status": "In Progress",
        "PlannedRelease": null,
        "CompletedOn": null
    },
    {
        "PromoName": "test promo 3",
        "AssignedTo": "RA TEAM",
        "CreatedOn": "2023-12-12 23:08:11",
        "Status": "In Progress",
        "PlannedRelease": null,
        "CompletedOn": null
    },
    {
        "PromoName": null,
        "AssignedTo": "RA TEAM",
        "CreatedOn": "2023-12-12 21:59:13",
        "Status": "In Progress",
        "PlannedRelease": null,
        "CompletedOn": null
    },
    {
        "PromoName": "test promo 7",
        "AssignedTo": "RA TEAM",
        "CreatedOn": "2023-12-12 00:00:00",
        "Status": "In Progress",
        "PlannedRelease": "2023-12-10 00:00:00",
        "CompletedOn": null
    },
    {
        "PromoName": "TEST PROMO 1 ",
        "AssignedTo": "ROVER_PRICING",
        "CreatedOn": "2023-12-12 12:49:06",
        "Status": "completed",
        "PlannedRelease": "2023-12-12 12:49:06",
        "CompletedOn": "2023-12-11 12:49:06"
    },
    {
        "PromoName": "TEST PROMO 2 ",
        "AssignedTo": "ROVER_PRICING",
        "CreatedOn": "2023-12-12 12:49:27",
        "Status": "completed",
        "PlannedRelease": "2023-12-12 12:49:27",
        "CompletedOn": "2023-12-10 12:49:27"
    }
]

select count(PROMO_REQUEST_ID) as Total from PROMO_REQUEST union all select count(status) as In Progress from PROMO_REQUEST where status=In Progress union all select count(status) as Completed from PROMO_REQUEST where status=Completed

I finished the first API. I am working on my next API.Its in progress.
There was lack of clarity due to audio connectivity issue.( It has been resolved now ) As my DB access was unavailable I had trouble accesing the tables.  I had already mentioned these difficulties
 I am working on the task and I will make it quick

I have shared the api details and my local ip so that ma'am can test it from her end. I needed clarification on the DB parameters which are equivalent to the UI fields so that I can map them correctly in the response. After clarification I can checkin my code for review. I also completed prerequiste VZ trainings on Learning portal


Hi Ma'am. My audio connectivity issue is resolved. The API is partially developed.
12:30
I need to add filter conditions to get the count in response. After that it will be completed.
12:30
Yesterday, I had also finished some prerequiste trainings on learning portal.


Insert into "DEVEREST"."PROMO_REQUEST" (PROMO_REQUEST_ID,MARKET_ID,MARKET_DESC,OFFER_ID,OFFER_DESC,DEVICE_BRAND,TOTAL_NET_SALE,TOTAL_PROMO_COST,STATUS,
SEGMENT,GROSSADDS_OR_UPGRADE,PRICE_PLANTYPE,PROMOTYPE,DEVICE_GENERATION,CHANNEL_TYPE,PROMO_CATEGORY,OFFER_EFFECTIVE_DATE,MFG_OR_OEM,DATA_TIER,ACQ_OR_RETEN,CREATED_DATE,CREATED_BY,UPDATED_DATE,UPDATED_BY
) values (1,4,null,null,null,null,1000,100,null,null,null,null,null,null,null,null,null,null,null,null,null,'nishant',null,'nishant')

https://bluejeans.com/964801133/0870

CREATE TABLE "SCOTT"."EMP"
   (    "EMPNO" NUMBER(4,0),
        "ENAME" VARCHAR2(10),
        "JOB" VARCHAR2(9),
        "MGR" NUMBER(4,0),
        "HIREDATE" DATE,
        "SAL" NUMBER(7,2),
        "COMM" NUMBER(7,2),
        "DEPTNO" NUMBER(2,0),
         CONSTRAINT "PK_EMP" PRIMARY KEY ("EMPNO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE,
         CONSTRAINT "FK_DEPTNO" FOREIGN KEY ("DEPTNO")
          REFERENCES "SCOTT"."DEPT" ("DEPTNO") ENABLE
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"


5:34
Now I will create Db Script for the API and test it locally

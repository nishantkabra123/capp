test

My DB Access status is Work In Progress on AYS. Once completed I will let you know

I saw commits for the PricePlan changes, Offer Filters and Plan Group of my co-workers.

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

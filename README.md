test

Hi Ma'am. I needed to verify below changes are as per the requirement

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

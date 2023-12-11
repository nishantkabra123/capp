test

I am developing a new API - fetchAllPromoRequests. I am co-ordinating with Rohith for it.

I need to create new Table, new Entity and map them to DTO. Besides that I have finished other parts of the API.
I will continue on it tomorrow morning
Hi, I created the client request and tested the Api. After that I debugged the code, changed the development env. and tried minor changes. I dint face any issues. I got the correct response. 
rover-pricing/api/getOfferDetailsView
Hi, I have finished the code changes, fixed the compilation errors and resolved build issues.Now I am creating Db Script for the API and testing it locally
My laptop was lagging a little and citrix was slow as well. So I closed all the unnecessary applications. I hope it frees the memory.

Insert into HR.EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID) values (100,'Steven','King','SKING','515.123.4567',to_date('17-JUN-87','DD-MON-RR'),'AD_PRES',24000,null,null,90);
Insert into HR.EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID) values (101,'Neena','Kochhar','NKOCHHAR','515.123.4568',to_date('21-SEP-89','DD-MON-RR'),'AD_VP',17000,null,100,90);
As my Local DB is unavailable, I have prepared the insert script to deploy on DEVEREST.

Insert into "DEVEREST"."PROMO_REQUEST" (PROMO_REQUEST_ID,MARKET_ID,MARKET_DESC,OFFER_ID,OFFER_DESC,DEVICE_BRAND,TOTAL_NET_SALE,TOTAL_PROMO_COST,STATUS,
SEGMENT,GROSSADDS_OR_UPGRADE,PRICE_PLANTYPE,PROMOTYPE,DEVICE_GENERATION,CHANNEL_TYPE,PROMO_CATEGORY,OFFER_EFFECTIVE_DATE,MFG_OR_OEM,DATA_TIER,ACQ_OR_RETEN,CREATED_DATE,CREATED_BY,UPDATED_DATE,UPDATED_BY
) values (1,4,null,null,null,null,1000,100,null,null,null,null,null,null,null,null,null,null,null,null,null,'nishant',null,'nishant')

https://bluejeans.com/964801133/0870

After review I can push my code as well and then test it

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

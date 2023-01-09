-- InvoiceValue - InvoiceTotal from invoice table
-- SalesValue - InvoiceTotal from invoice table
-- OrderValue - Total from orderItems table
-- CollectionsValue - PaidAmount from payments table

-- Queries

-- 1. To get the list of customers in the database
SELECT * FROM CUSTOMERMASTER;
-- 2. To get the list of orders in the database
SELECT * FROM ORDERITEMS;
-- 3. To get the list of regions in the database
SELECT REGIONCODE FROM CUSTOMERMASTER;
-- 4. To get the list of orders for customer 1631
SELECT * FROM ORDERREG WHERE CUSTOMERID = 1631;
-- 5. To get the list of customers for the region BA, CH, MU, PU
SELECT * FROM CUSTOMERMASTER WHERE REGIONCODE LIKE 'BA' OR REGIONCODE LIKE 'CH' OR REGIONCODE LIKE 'MU'OR REGIONCODE LIKE 'PU';
-- 6. To get the list of orders for the year 2005
SELECT * FROM ORDERREG WHERE ORDERDATE LIKE '2005%';
-- 7. To get the list of invoices for the year 2005 and for the customer 961
SELECT * FROM INVOICE WHERE INVOICEDT LIKE '2005%' AND CUSTOMERID = 961;
-- 8. To get the list of customers whose name begins with T
SELECT * FROM CUSTOMERMASTER WHERE SHORTNAME LIKE 'T%';
-- 9. To get the list of invoices either for the customer 1631 or for the month -- March 2005
SELECT * FROM INVOICE WHERE CUSTOMERID = 1631 OR INVOICEDT LIKE '2005-03%';
-- 10. To get the total number of customers in the database
SELECT COUNT(CUSTOMERID) AS TOTAL FROM CUSTOMERMASTER;
-- 11. To get the total number of orders for the customer 1631 for the year 2006
SELECT COUNT(ORDERID) FROM ORDERREG WHERE CUSTOMERID = 1631 AND ORDERDATE LIKE '2006%';
-- 12. To get the total order value of the database
SELECT SUM(TOTAL) AS TOTAL FROM ORDERITEMS;
-- 13. To get the total sales value of the database for the customer 961
SELECT SUM(INVOICETOTAL) FROM INVOICE WHERE CUSTOMERID = 961;
-- 14. To get the total outstanding amount of the database
SELECT SUM(OUTSTANDINGAMOUNT) FROM PAYMENTS;
-- 15. To get the total number of customers for each region [RegionCode, CustomerCount]
SELECT COUNT(CUSTOMERID), REGIONCODE FROM CUSTOMERMASTER GROUP BY REGIONCODE;
-- Top 3 regions with highest customer count
SELECT COUNT(CUSTOMERID) AS COUNTS, REGIONCODE FROM CUSTOMERMASTER GROUP BY REGIONCODE ORDER BY COUNTS DESC LIMIT 3;
-- 16. To get the total number of orders for each customer id [CustomerId, OrderCount]
SELECT CUSTOMERID, COUNT(ORDERID) AS COUNTS FROM ORDERREG GROUP BY CUSTOMERID;
-- 17. To get the total sales value for each customer id [CustomerId, SalesValue]
SELECT CUSTOMERID, SUM(INVOICETOTAL) AS SALES_VALUE FROM INVOICE GROUP BY CUSTOMERID;
-- 18. To get the total sales value for each customer in the year 2005
SELECT CUSTOMERID, SUM(INVOICETOTAL) AS SALES_VALUE FROM INVOICE WHERE INVOICEDT LIKE '2005%' GROUP BY CUSTOMERID;
-- 19. To get the list of orders with its customer information
-- OrderId, OrderDate, CustomerId, CustomerName, RegionCode
SELECT ORDERS.OrderID, ORDERS.OrderDate, CUSTOMER.CustomerID, CUSTOMER.ShortName, CUSTOMER.RegionCode
FROM ORDERREG ORDERS INNER JOIN CUSTOMERMASTER CUSTOMER
ON ORDERS.CustomerId = CUSTOMER.CustomerId;
-- 20. List of all invoices with their order information 
-- (InvoiceId, InvoiceDate, InvoiceTotal, OrderId, OrderDate)
SELECT INVOICE.InvoiceID, INVOICE.InvoiceDt, INVOICE.InvoiceTotal, ORDERS.OrderID, ORDERS.OrderDate
FROM INVOICE LEFT JOIN ORDERREG ORDERS
ON INVOICE.OrderID = ORDERS.OrderID;
-- 21. List of all invoices with their payment information
-- (InvoiceId, InvoiceDate, InvoiceTotal, PaidAmount, OutstandingAmount)
SELECT INVOICE.INVOICEID, INVOICE.INVOICEDT, INVOICE.INVOICETOTAL,  PAYMENTS.PAIDAMOUNT, PAYMENTS.OUTSTANDINGAMOUNT
FROM INVOICE JOIN PAYMENTS
ON INVOICE.INVOICEID = PAYMENTS.INVOICEID;
-- 22. List of all the orders for the year 2006 with their customer information
-- (OrderId, OrderDate, CustomerId, CustName, RegionCode)
SELECT ORDERS.ORDERID, ORDERS.ORDERDATE, CUSTOMER.CUSTOMERID, CUSTOMER.SHORTNAME, CUSTOMER.REGIONCODE
FROM ORDERREG ORDERS JOIN CUSTOMERMASTER CUSTOMER
WHERE ORDERS.ORDERDATE LIKE '2006%';
-- 23. Item with or without order information
-- (ItemNo, LstPrice, MarketingFactor, Rate, Qty, Total)
SELECT PM.ITEMNO, PM.LISTPRICE, PM.MARKETINGFACTOR, ORDERS.RATE, ORDERS.QTY, ORDERS.TOTAL
FROM PRODUCTMASTER PM JOIN ORDERITEMS ORDERS 
ON PM.ITEMNO = ORDERS.ITEMNO;
-- 24. Customers with or without order information
-- (CustomerId, CustName, RegionCode, OrderId, OrderDate)
SELECT CUSTOMER.CUSTOMERID, CUSTOMER.SHORTNAME, CUSTOMER.REGIONCODE, ORDERS.ORDERID, ORDERS.ORDERDATE
FROM CUSTOMERMASTER CUSTOMER JOIN ORDERREG ORDERS
ON CUSTOMER.CUSTOMERID = ORDERS.CUSTOMERID;
-- 25. Customer information with their invoice and payment information
-- (CustomerId, CustName, RegionCode, InvoiceId, InvoiceTotal, PaidAmount, OutstandingAmount)
SELECT CUSTOMER.CUSTOMERID, CUSTOMER.SHORTNAME, CUSTOMER.REGIONCODE, INVOICE.INVOICEID, INVOICE.INVOICETOTAL, PAYMENTS.PAIDAMOUNT, PAYMENTS.OUTSTANDINGAMOUNT
FROM CUSTOMERMASTER CUSTOMER INNER JOIN INVOICE 
ON CUSTOMER.CUSTOMERID = INVOICE.CUSTOMERID
INNER JOIN PAYMENTS PAYMENTS
ON INVOICE.INVOICEID = PAYMENTS.INVOICEID;
-- 26. Customer information with their orders, with or without invoice and payment information
-- (CustomerId, CustName, RegionCode, OrderId, OrderDate, 
-- InvoiceId, InvoiceTotal, PaidAmount, OutstandingAmount)

-- 27. Orders with its item information
-- (OrderId, OrderDate, ItemNo, ListPrice, MarketingFactor, Rate, Qty, Total)

-- 28. Total number of orders for each region
-- (RegionCode, OrderCount)


-- Region with highest order count
-- (RegionCode, OrderCount)

-- 29. The total invoice value for each region in the database
-- (RegionCode, InvoiceValue)


-- 30. Total order value for each customer
-- (CustomerId, CustName, OrderValue)


-- 31. Total order value, invoice value and collections value for each customer
-- in the database
-- CustomerId, CustomerName, OrderValue, InvoiceValue, CollectionsValue

-- 32. Monthly sales report for the year 2006
-- MonthName, InvoiceValue

-- 33. Yearly Sales report for the customer 1631
-- Year InvoiceValue

-- 34. Region with the highest CollectionsValue
-- RegionCode, CollectionsValue


-- 35. Create a view CustomerOrdInvPayInfo which will give the list of all
-- customers with or without their order, invoice and payment information
-- (CustomerId, CustName, RegionCode, OrderId, OrderDate, InvoiceId, InvoiceTotal,
--  SalesTax, GrandTotal, PaidAmount, OutstandingAmount)
-- Query from this view and then get the total invoice value for each customer
-- (CustomerName, InvoiceValue)

 
-- 35. To get the list of orders for the customer PRS using subquery

-- 36. Total number of orders in the database for each customer using subquery

-- 37. Customer with their sales value and collections value using subquery

-- 38. Orders for the customers belonging to the reigon 'BA' using subquery

-- 39. List of invoices for 2005 which have highest sales value 
-- when compared to the list of invoices for the year 2006 ALL PREDICATE

-- 40. To check the list of items which do not have an order - EXISTS PREDICATE
-- ItemNo, ListPrice, MarketingFactor


-- 41. Order Total for each region in the database using joins

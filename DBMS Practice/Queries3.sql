/*SELECT INTO does not work in MySQL*/


/*The "INSERT INTO SELECT" statement in SQL allows
 you to insert data into a table by selecting it from another table or query. */
CREATE TABLE temp_table(FirstName VARCHAR(50),LastName VARCHAR(50),Email VARCHAR(100));
INSERT INTO temp_table(FirstName,LastName,Email)
SELECT FirstName,LastName,Email
FROM customers;

SELECT *
FROM temp_table;

/*
The "CREATE INDEX" statement in SQL is used to create an index on one or more columns of a table.
Indexes are used to improve the performance of queries by allowing 
the database to quickly locate the rows that satisfy the conditions in the query's WHERE clause. 
*/

CREATE INDEX idx_Customers_LastName ON Customers (LastName);
SHOW INDEX FROM customers;

/*The "DROP" statement in SQL is used to remove an existing database object,
 such as a table, index, or view.*/
DROP TABLE customers;


/*The "ALTER" statement in SQL is used to modify the structure of existing database objects, such as
 tables, views, or columns. It allows you to add, modify, or delete columns, constraints,
 or other properties of the objects.*/
ALTER TABLE Customers
DROP COLUMN Phone;
ALTER TABLE Customers
ALTER COLUMN Email VARCHAR(150);

ALTER TABLE Customers
RENAME COLUMN FirstName TO First_Name;

/*The "GROUP BY" clause in SQL is used to group rows based on 
one or more columns in a table. It is commonly used in conjunction
 with aggregate functions to calculate summary information for each group. */
 
SELECT Category, COUNT(*) AS Count
FROM Products
GROUP BY Category;

/*The "HAVING" clause is used in conjunction with the "GROUP BY" clause to filter 
the results of a query based on a condition applied to aggregated values. 
It allows you to filter groups of rows based on the result of an aggregate function. */


SELECT Category, AVG(Price) AS AveragePrice
FROM Products
GROUP BY Category
HAVING AVG(Price) > 20;

/*a View is a virtual table that is derived from the result of a query. 
It is a saved SQL query that can be treated and used 
like a regular table in subsequent queries*/

CREATE VIEW CustomerDetails AS
SELECT Customers.CustomerID, Customers.FirstName, Customers.LastName, Orders.OrderID, Orders.Product, Orders.Quantity
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID;

SELECT *
FROM CustomerDetails
WHERE LastName = 'Smith';



/*NULL Functions

COALESCE: The COALESCE function is used to return the first non-NULL value from a list of expressions.

NULLIF: The NULLIF function is used to compare two expressions and return NULL if they are equal, or the first expression if they are not equal.

*/

SELECT *
FROM Customers
WHERE Email IS NULL;

SELECT COALESCE(FirstName, 'N/A') AS FirstName
FROM Customers;

SELECT NULLIF(FirstName, LastName) AS Result
FROM Customers;



/* sql queries */

/*  This query selects all columns (*) from the Customers table and retrieves all rows. */
SELECT * FROM Customers;

/* This query selects distinct combinations of FirstName and LastName from the Customers table. */
SELECT DISTINCT FirstName, LastName FROM Customers;

/*It retrieves all rows where the first name of the customer is set to 'John'.*/
SELECT * FROM Customers WHERE FirstName = 'John';

/*AND & OR Keyword*/
SELECT * FROM Products WHERE Category = 'Category X' AND SupplierID = 1;
SELECT * FROM Products WHERE Category = 'Category X' OR SupplierID = 1;

/*This query will return all the customer records from the Customers table and order them based on the LastName column in ascending alphabetical order.
*/
SELECT * FROM Customers
ORDER BY LastName ASC;

/*In this example, the query updates the Email column for the customer with CustomerID 1 and sets it to 'newemail@example.com'.*/
UPDATE Customers
SET Email = 'newemail@example.com'
WHERE CustomerID = 1;

/*In this example, the query deletes the order with OrderID 1 from the Orders table. */
DELETE FROM Orders
WHERE OrderID = 1;

/*The keyword "TOP" is commonly used in SQL Server to limit the number of rows returned by a query. MySQL uses LIMIT,ROWNUM is used in Oracle*/
SELECT  * FROM Products LIMIT 5;

/*The "LIKE" keyword is used in SQL to perform pattern matching within a query. 
It is typically used in conjunction with the "%" wildcard character to match patterns. 
To retrieve all customers whose last name starts with "S" from the Customers table:*/
SELECT * FROM Customers
WHERE LastName LIKE 'S%';

/*The "IN" keyword in SQL is used to specify multiple values in a WHERE clause.
To retrieve all products in the "Category X" or "Category Y" from the Products table:

*/
SELECT * FROM Products
WHERE Category IN ('Category X', 'Category Y');

/*The "BETWEEN" keyword in SQL is used to select values within a specified range. 
To retrieve all products with a price between $10 and $20 from the Products table:

*/

SELECT * FROM Products
WHERE Price BETWEEN 10 AND 20;
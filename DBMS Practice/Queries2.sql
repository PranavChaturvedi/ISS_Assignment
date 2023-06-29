/*
Alias is a feature that allows you to assign a temporary name or alias to a table or column in a query.

In this example, "AS" is used to assign aliases to the Customers and Orders tables as "c" and "o", 
respectively. 

These aliases are then used to reference the tables when specifying the columns and joining the tables together.

*/

SELECT c.FirstName, c.LastName, o.OrderID
FROM Customers AS c
JOIN Orders AS o ON c.CustomerID = o.CustomerID;

/*
The "INNER JOIN" is a clause in SQL used to combine rows from two or more tables based on a related column between them.

In this example, the query joins the Orders and Customers tables based on the CustomerID column.
*/

SELECT Orders.OrderID, Customers.FirstName, Customers.LastName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;


/*The "LEFT JOIN" is a clause in SQL used to combine rows from the left table with matching rows from the right table.

All rows from the left table (Customers) are included in the result set, and matching rows from the right table (Orders) are joined based on the join condition.


*/

SELECT Customers.CustomerID, Customers.FirstName, Customers.LastName, Orders.OrderID
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;


/*The "RIGHT JOIN" is a clause in SQL used to combine rows from the right table with matching rows from the left table. 
If there is no match in the left table, NULL values are returned for the left table's columns.
The "RIGHT JOIN" is useful when you want to retrieve all records from the right table, 
regardless of whether there is a match in the left table.


*/

SELECT Orders.OrderID, Customers.FirstName, Customers.LastName
FROM Orders
RIGHT JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

/*The "FULL JOIN" is a clause in SQL used to combine rows from both the left and right tables.

 
*/
SELECT Customers.CustomerID, Customers.FirstName, Customers.LastName, Orders.OrderID
FROM Customers
FULL JOIN Orders ON Customers.CustomerID = Orders.CustomerID;

/*
The "UNION" keyword
in SQL is used to combine the results of two
 or more SELECT statements into a single result set.
*/

SELECT CustomerID FROM customers 
UNION 
SELECT Product FROM orders;

/*
Result
1
2
3
4
5
6
7
8
9
10
Product A
Product B
Product C
*/

/*A stored procedure is a named set of SQL statements that are stored 
in the database and can be executed repeatedly. 
It is a database object 
that encapsulates a sequence of operations or queries and can accept input parameters 
and return output parameters or result sets.

Here's an example of creating a simple stored procedure in SQL:

*/

CREATE PROCEDURE GetCustomerDetails
    @CustomerId INT
AS
BEGIN
    SELECT *
    FROM Customers
    WHERE CustomerID = @CustomerId;
END;

/*In this example, we create a stored procedure named "GetCustomerDetails" 
that accepts an input parameter @CustomerId. The procedure selects all columns 
from the "Customers" table where the CustomerID matches the input parameter.

*/

/*Prepared Statement : Used to execute simple queries.
Callable Statement : Used to execute procedures*/
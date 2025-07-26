Problem Statement: <br>
In a secure financial system, transactions are validated based on user roles. <br> Given a list of transactions (each with an amount and role) and a role hierarchy,<br> write a function to count valid transactions. <br> A transaction is valid if its amount is within the role’s limit:<br> 
"USER": ≤ 1000 <br>
"MANAGER": ≤ 5000 <br>
"ADMIN": No limit <br>
Input: <br>
transactions: Array of Transaction objects (int amount, String role) <br>
Output: <br>
Integer: Number of valid transactions 

package transactions_demo;

/* 
Problem Statement: 
In a secure financial system, transactions are validated based on user roles. Given a list of transactions (each with an amount and role) and a role hierarchy, write a function to count valid transactions. A transaction is valid if its amount is within the role’s limit: 
"USER": ≤ 1000 
"MANAGER": ≤ 5000 
"ADMIN": No limit 
Input: 
transactions: Array of Transaction objects (int amount, String role) 
Output: 
Integer: Number of valid transactions 
 */

public class TxnApp {

	// count txns.
	private static long countTxns(Transactions[] txns) {

		// go through the txns record.
		int count = 0; // 0
		for (Transactions txn : txns) {

			// inspect the role of the user.
			String role = txn.getRole();
			switch (role) {

			case "USER":

				if (txn.getAmount() <= 1000) {
					++count; // fine.
				} else {
					// do nothing.  is invalid.
				}

				break;
			case "MANAGER":
				if (txn.getAmount() <= 5000) {
					++count;
				} else {
					// do nothing.
				}

				break;
			case "ADMIN":

				++count;

				break;

			}

		}

		return count;
	}

	public static void main(String[] args) {


		Transactions[] txns = new Transactions[] {
				new Transactions(1000, "USER"),  // valid
				new Transactions(10, "USER"),  // valid
				new Transactions(20, "USER"), // valid
				new Transactions(12200, "USER"), // invalid
				new Transactions(1224340, "USER"), // invalid
				new Transactions(5000, "MANAGER"), // valid
				new Transactions(1, "MANAGER"), // valid
				new Transactions(2, "MANAGER"), // valid
				new Transactions(40000, "MANAGER"), // invalid
				new Transactions(1000, "ADMIN"), // valid
				new Transactions(90, "ADMIN"), // valid
				new Transactions(10, "ADMIN"), // valid
				new Transactions(10000000, "ADMIN"), // valid

		};

		// call the count of transactions function.
		System.out.println("valid txns : " + countTxns(txns)); // 10

	}

}

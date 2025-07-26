package transactions_demo;

public class Transactions {

	private int amount;
	private String role;

	public Transactions() {
	}

	public Transactions(int amount, String role) {
		super();
		this.amount = amount;
		this.role = role;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Transactions [amount=" + amount + ", role=" + role + "]";
	}

}

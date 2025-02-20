package classwork2;

public class bankingsystem {
	public int id;
	public String name;
	public double price;

	public bankingsystem(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void detail() {
		System.out.println(id + " Laptop " + price);
	}

	public static void main(String[] args) {
		bankingsystem BankingSystem = new bankingsystem(101, "Name", 75000);
		BankingSystem.detail();
	}
}

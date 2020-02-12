package Head_First.Module_Command.diner;

public class Waitress {
	Order order;

	public Waitress() {
	}

	public void takeOrder(Order order) {
		this.order = order;
		order.orderUp();
	}
}
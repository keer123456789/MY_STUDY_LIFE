package Head_First.Module_Command.dinerCommand;

public class Waitress {
	Order order;

	public Waitress() {
	}

	public void setOrder(Order order){
		this.order=order;
	}

	public void takeOrder(Order order) {
		setOrder(order);
		order.execute();
	}
}
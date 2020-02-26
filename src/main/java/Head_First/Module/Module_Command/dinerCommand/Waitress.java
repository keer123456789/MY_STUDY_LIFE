package Head_First.Module.Module_Command.dinerCommand;

public class Waitress {
	Order order;

	public Waitress() {
	}

	private void setOrder(Order order){
		this.order=order;
	}

	public void takeOrder(Order order) {
		setOrder(order);
		order.execute();
	}
}
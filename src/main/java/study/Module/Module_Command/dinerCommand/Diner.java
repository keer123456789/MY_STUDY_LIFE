package study.Module.Module_Command.dinerCommand;


public class Diner {
	public static void main(String[] args) {
		Cook cook = new Cook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		CookMakeFriesCommand friesCommand=new CookMakeFriesCommand(cook);
		CookMakeBurgerCommand burgerCommand=new CookMakeBurgerCommand(cook);

		customer.hungry(friesCommand);
		customer.hungry(burgerCommand);


	}
}
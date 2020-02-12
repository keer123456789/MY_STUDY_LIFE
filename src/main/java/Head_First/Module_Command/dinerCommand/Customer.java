package Head_First.Module_Command.dinerCommand;

public class Customer {
    Waitress waitress;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void hungry(Order o) {
        System.out.println("服务员点餐");
        waitress.takeOrder(o);
    }

}
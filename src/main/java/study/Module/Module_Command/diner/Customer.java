package study.Module.Module_Command.diner;

public class Customer {
    Waitress waitress;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void hungry(Order o) {
        System.out.println("服务员点餐");
        order();
        waitress.takeOrder(o);
    }

    public void order() {
        System.out.println("我要汉堡和薯条");
    }
}
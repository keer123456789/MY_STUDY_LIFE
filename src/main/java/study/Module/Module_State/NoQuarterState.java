package study.Module.Module_State;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Module.Module_State
 * @Author: keer
 * @CreateTime: 2020-03-09 14:43
 * @Description: 没有25美分状态
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}

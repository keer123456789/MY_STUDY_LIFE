package study.Module.Module_State;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Module.Module_State
 * @Author: keer
 * @CreateTime: 2020-03-09 14:45
 * @Description: 有25美分状态
 */
public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}

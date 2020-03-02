package study.Module.Module_Command.dinerCommand;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Command.diner
 * @Author: keer
 * @CreateTime: 2020-02-12 21:44
 * @Description: 做汉堡命令
 */
public class CookMakeBurgerCommand implements Order {
    private Cook cook;

    public CookMakeBurgerCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.makeBurger();
    }
}

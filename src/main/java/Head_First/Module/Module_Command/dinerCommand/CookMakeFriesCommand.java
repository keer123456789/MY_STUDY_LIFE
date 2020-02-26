package Head_First.Module.Module_Command.dinerCommand;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Command.dinerCommand
 * @Author: keer
 * @CreateTime: 2020-02-12 21:47
 * @Description: 做薯条命令
 */
public class CookMakeFriesCommand implements Order {
    private Cook cook;

    public CookMakeFriesCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.makeFries();
    }
}

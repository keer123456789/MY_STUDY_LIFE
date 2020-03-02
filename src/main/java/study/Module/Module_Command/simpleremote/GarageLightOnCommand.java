package study.Module.Module_Command.simpleremote;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Command.simpleremote
 * @Author: keer
 * @CreateTime: 2020-02-12 19:45
 * @Description: 打开车库灯
 */
public class GarageLightOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }
}

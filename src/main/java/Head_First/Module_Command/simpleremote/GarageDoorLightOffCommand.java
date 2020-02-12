package Head_First.Module_Command.simpleremote;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Command.simpleremote
 * @Author: keer
 * @CreateTime: 2020-02-12 19:48
 * @Description: 关闭车库灯
 */
public class GarageDoorLightOffCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }
}

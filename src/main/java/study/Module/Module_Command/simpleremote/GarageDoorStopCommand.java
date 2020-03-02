package study.Module.Module_Command.simpleremote;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Command.simpleremote
 * @Author: keer
 * @CreateTime: 2020-02-12 19:33
 * @Description: 车库门停止
 */
public class GarageDoorStopCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }
}

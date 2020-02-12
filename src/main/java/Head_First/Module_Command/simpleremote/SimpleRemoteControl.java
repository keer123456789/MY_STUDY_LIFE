package Head_First.Module_Command.simpleremote;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Command.simpleremote
 * @Author: keer
 * @CreateTime: 2020-02-12 19:50
 * @Description: 远程控制
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

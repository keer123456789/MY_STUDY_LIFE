package study.Module.Module_Command.simpleremote;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Command.simpleremote
 * @Author: keer
 * @CreateTime: 2020-02-12 19:04
 * @Description: 开灯命令
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

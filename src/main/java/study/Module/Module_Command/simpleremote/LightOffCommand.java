package study.Module.Module_Command.simpleremote;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Command.simpleremote
 * @Author: keer
 * @CreateTime: 2020-02-12 19:02
 * @Description: 关灯命令
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

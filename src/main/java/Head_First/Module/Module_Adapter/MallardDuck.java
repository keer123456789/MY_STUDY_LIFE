package Head_First.Module.Module_Adapter;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Adapter
 * @Author: keer
 * @CreateTime: 2020-02-16 15:54
 * @Description: 鸭子实例
 */
public class MallardDuck implements  Duck{
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

}

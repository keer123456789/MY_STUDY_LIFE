package Head_First.Module.Module_Adapter;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Adapter
 * @Author: keer
 * @CreateTime: 2020-02-16 15:55
 * @Description: 火鸡实例
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}

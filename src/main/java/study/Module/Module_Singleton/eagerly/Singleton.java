package study.Module.Module_Singleton.eagerly;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Singleton.eagerly
 * @Author: keer
 * @CreateTime: 2020-02-10 15:10
 * @Description: 急切实例化
 */
public class Singleton {
    private volatile static Singleton uniqueInstance=new Singleton();
    private Singleton() {}

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}

package study.Module.Module_Singleton.doubleCheck;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Singleton.doubleCheck
 * @Author: keer
 * @CreateTime: 2020-02-10 15:04
 * @Description: 双重加锁
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}

package study.Module.Module_Singleton.threadsafe;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Singleton.threadsafe
 * @Author: keer
 * @CreateTime: 2020-02-10 15:15
 * @Description:
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

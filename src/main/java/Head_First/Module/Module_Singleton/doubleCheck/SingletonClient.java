package Head_First.Module.Module_Singleton.doubleCheck;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Singleton.doubleCheck
 * @Author: keer
 * @CreateTime: 2020-02-10 15:07
 * @Description:
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

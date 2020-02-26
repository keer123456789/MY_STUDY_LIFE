package Head_First.Module.Module_Singleton.eagerly;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Singleton.eagerly
 * @Author: keer
 * @CreateTime: 2020-02-10 15:12
 * @Description:
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

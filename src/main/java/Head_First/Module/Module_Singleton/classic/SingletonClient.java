package Head_First.Module.Module_Singleton.classic;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Singleton
 * @Author: keer
 * @CreateTime: 2020-02-10 14:51
 * @Description: 经典单例模式测试
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

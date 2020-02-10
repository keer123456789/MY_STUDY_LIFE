package Head_First.Module_Singleton.classic;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Singleton
 * @Author: keer
 * @CreateTime: 2020-02-10 14:47
 * @Description: 经典单间模式
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}

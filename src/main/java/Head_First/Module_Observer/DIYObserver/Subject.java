package Head_First.Module_Observer.DIYObserver;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Observer
 * @Author: keer
 * @CreateTime: 2020-01-30 13:50
 * @Description:
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

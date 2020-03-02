package study.Module.Module_Iterator.Component;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Module.Module_Iterator.Component
 * @Author: keer
 * @CreateTime: 2020-03-02 17:18
 * @Description: 服务员
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}

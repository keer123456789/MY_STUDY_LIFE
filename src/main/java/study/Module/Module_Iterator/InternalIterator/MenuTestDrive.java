package study.Module.Module_Iterator.InternalIterator;


/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Iterator
 * @Author: keer
 * @CreateTime: 2020-02-24 15:23
 * @Description:
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu=new PancakeHouseMenu();
        Menu dinerMenu=new DinerMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}

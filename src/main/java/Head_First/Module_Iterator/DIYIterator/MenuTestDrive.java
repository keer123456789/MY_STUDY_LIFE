package Head_First.Module_Iterator.DIYIterator;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Iterator
 * @Author: keer
 * @CreateTime: 2020-02-24 15:23
 * @Description:
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}

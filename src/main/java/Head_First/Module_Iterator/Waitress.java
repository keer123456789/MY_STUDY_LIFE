package Head_First.Module_Iterator;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Iterator
 * @Author: keer
 * @CreateTime: 2020-02-24 15:14
 * @Description: 服务员代码
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator dinerIterator = this.dinerMenu.createIterator();

        System.out.println("MENU\n--------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);

    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem= (MenuItem) iterator.next();
            System.out.println(menuItem.getName()+",");
            System.out.print(menuItem.getPrice()+"--");
            System.out.println(menuItem.getDescription());
        }
    }
}

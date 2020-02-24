package Head_First.Module_Iterator;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Iterator
 * @Author: keer
 * @CreateTime: 2020-02-24 14:09
 * @Description: 菜单
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }
}

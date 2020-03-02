package study.Module.Module_Iterator.InternalIterator;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Iterator
 * @Author: keer
 * @CreateTime: 2020-02-24 14:09
 * @Description: 菜单
 */
public class MenuItem {
    String name;//菜名
    String description;//菜品描述
    boolean vegetarian;//是否为素食
    double price;//价格

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

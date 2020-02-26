package Head_First.Module.Module_Factory.FactoryMethod.Pizza;

import java.util.ArrayList;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Factory
 * @Author: keer
 * @CreateTime: 2020-02-02 23:16
 * @Description:
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough……");
        System.out.println("Adding sauce……");
        System.out.println("Adding topoings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 ");
    }

    public void cut() {
        System.out.println("Cutting pizza …… ");
    }

    public void box() {
        System.out.println("Package pizza in the box ");
    }

    public String getName() {
        return name;
    }
}

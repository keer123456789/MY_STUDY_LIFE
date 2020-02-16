package Head_First.Module_Adapter;

import java.util.Random;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module_Adapter
 * @Author: keer
 * @CreateTime: 2020-02-16 16:00
 * @Description: 鸭子适配器
 */
public class DuckAdapter implements Turkey{
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5)  == 0) {
            duck.fly();
        }
    }
}

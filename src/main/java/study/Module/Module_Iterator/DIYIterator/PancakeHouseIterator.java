package study.Module.Module_Iterator.DIYIterator;

import java.util.ArrayList;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.Module.Module_Iterator
 * @Author: keer
 * @CreateTime: 2020-02-24 15:05
 * @Description: 蛋糕店迭代器
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> list;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size() || list.get(position) == null) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = list.get(position);
        position = position + 1;
        return menuItem;
    }
}

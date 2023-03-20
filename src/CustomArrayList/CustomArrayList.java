package CustomArrayList;

import CustomList.CustomList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CustomArrayList<T> extends CustomList {

    private int sizeByDefault;
    private int size;
    private Object data;

    public CustomArrayList() {
        this.sizeByDefault = 10;
    }

    public CustomArrayList(int size) {
        this.sizeByDefault = size;
    }

    public CustomArrayList(CustomList array) {
        this.size = array.size();

        this.data = array;
        System.out.println(this.data.size());

        System.out.println(data);
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }
}

package Jihe;

import java.util.ArrayList;
import java.util.List;

public class ListDeom {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add(1);
        list.add("河池学院");
        list.add(66.6f);
        list.add(true);
        list.add(1);

        System.out.println("当前集合的元素个数：" + list.size());
        for (int i=0; i<list.size();i++)
            System.out.println(list.get(i));
    }
}

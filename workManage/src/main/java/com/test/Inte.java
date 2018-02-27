package com.test;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by task on 2018/2/23.
 */
public class Inte {


    public void test() {
        List list = new ArrayList();

        Map map = new HashMap<Object, Object>();
//        Comparable
//        Comparator
        String str = "we";
//        Collections
    }

    @Test
    public void compareTest() {
        CollectDemo demo = new CollectDemo("ao", 1, 12);
        CollectDemo demo1 = new CollectDemo("ao", 2, 13);
        CollectDemo demo2 = new CollectDemo("ao", 3, 11);
        int i = demo.compareTo(demo1);
        System.out.println(i);//1
        List<CollectDemo> demoList = new ArrayList<>();
        demoList.add(demo);
        demoList.add(demo1);
        demoList.add(demo2);
        //自然序排序-升序 (这与实现内比较器的接口中的方法写法也有关)
        Collections.sort(demoList);
        //自然序排序-与上相反
        Collections.sort(demoList, Collections.reverseOrder());
        for (CollectDemo demos : demoList) {
            System.out.println(demos.getAge());
        }


    }

    @Test
    public void comparatorTest() {
        CollectDemo demo = new CollectDemo("ao", 1, 12);
        CollectDemo demo1 = new CollectDemo("ao", 2, 13);
        CollectDemo demo2 = new CollectDemo("ao", 3, 11);
        CollectDemo demo3 = new CollectDemo("ao", 3, 14);
        List<CollectDemo> demoList = new ArrayList<>();
        demoList.add(demo);
        demoList.add(demo1);
        demoList.add(demo2);
        demoList.add(demo3);
        ComparatorDemo comparatorDemo = new ComparatorDemo();
        //升序
        Collections.sort(demoList, comparatorDemo);
 /*     {"name":"ao","classNo":1,"age":12}
        {"name":"ao","classNo":2,"age":13}
        {"name":"ao","classNo":3,"age":11}
        {"name":"ao","classNo":3,"age":14}*/
        // 与上相反
        Collections.sort(demoList, Collections.reverseOrder(comparatorDemo));
        for (CollectDemo demos : demoList) {
            System.out.println(new Gson().toJson(demos));
        }
    }

    @Test
    public void collectionsTest() {
        //ArrayList 是有序可重复 底层使用数组    线程不安全的集合  查询快 增加和删除慢   容量扩充 old*1.5+1
//        执行删除并不会减少数组容量
        List<CollectDemo> list = new ArrayList<>();
        //LinkedList 是有序可重复 底层使用双向循环链表书记结构  线程不安全  增加和删除快

    }


}

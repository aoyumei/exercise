package com.test;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 集合练习类
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
    public void collectionsTest() throws InterruptedException {
//1.List
        //ArrayList 是有序可重复 底层使用数组    线程不安全的集合  查询快 增加和删除慢   容量扩充 old*1.5+1
        // 执行删除并不会减少数组容量
        List<CollectDemo> list = new ArrayList<>();
        //LinkedList 是有序可重复 底层使用双向循环链表书记结构  线程不安全  增加和删除快
        List<CollectDemo> linkList = new LinkedList<>();
        //Vector 有序可重复 ，底层使用数组，线程安全，查询快，增删慢，效率低，容量扩充 默认为一倍
        Vector<Object> objects = new Vector<>();
//2.Set
        //HashSet 无序不可重复，内部是HashMap,底层使用Hash表实现，线程不安全，存取速度快
        Set<CollectDemo> collectDemos = new HashSet<>();
        //TreeSet 无序不可重复，内部是TreeMap的SortSet,排序存储，底层使用二叉树
//3.Queue   “先进先出” linkList implements Deque<E>,而 (Deque<E> extends Queue<E)
//   Queue的实现一般并不容许插入null，只有LinkedList是一个意外，它容许插入null，但使用者必须注意，不要与poll和peek方法返回的null值混淆
        Queue queue = new LinkedList();
        //BlockingQueue 继承 Queue;阻塞队列，线程安全
        BlockingQueue<CollectDemo> blockingQueue = new LinkedBlockingQueue<>();
        //如果队列已满，则抛出一个IIIegaISlabEepeplian异常
        boolean add = blockingQueue.add(new CollectDemo("1号", 1, 2));
        //如果队列已满，则返回false
        boolean offer = blockingQueue.offer(new CollectDemo("2号", 1, 2));
        //如果队列满，则阻塞
        blockingQueue.put(new CollectDemo("2号", 1, 2));
//4.Map
        //HashMap存储数据的格式是键-值形式， 键不可重复，值可重复， 线程不安全， 底层哈希表，键值可为null
        //HashTable线程安全
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        System.out.println(map.size());
        for (String s : map.keySet()) {
            System.out.println(s);//null
        }
    }


}

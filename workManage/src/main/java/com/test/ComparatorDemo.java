package com.test;

import java.util.Comparator;

/**
 * Created by task on 2018/2/26.
 */
public class ComparatorDemo implements Comparator<CollectDemo> {
    /**
     * 规则：按班级排序，班级相同时按年龄排序
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(CollectDemo o1, CollectDemo o2) {
        if (o1.getClassNo() - o2.getClassNo() == 0) {
            return o1.getAge() - o2.getAge();
        } else {
            return o1.getClassNo() - o2.getClassNo();
        }
    }
}

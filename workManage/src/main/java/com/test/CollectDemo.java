package com.test;

/**
 * Created by task on 2018/2/26.
 */
public class CollectDemo implements Comparable<CollectDemo> {


    private String name;
    private Integer classNo;
    private Integer age;

    public CollectDemo() {
    }

    public CollectDemo(String name, Integer classNo, Integer age) {
        this.name = name;
        this.classNo = classNo;
        this.age = age;
    }

    @Override
    public int compareTo(CollectDemo o) {
        if (this.age.compareTo(o.getAge()) > 0) {
            return 1;
        } else if (this.age.compareTo(o.getAge()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "CollectDemo{"
                + "name=" + this.name
                + ",age=" + this.age
                + ",classNo=" + this.classNo + "}";
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}

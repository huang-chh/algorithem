package com.tiger.demo.selectionsort;

import java.util.Arrays;

/**
 * @Date 2020/7/12
 * @Author tiger
 * 选择排序不稳定验证
 */

public class SelectionDemo2 {
    public static void main(String[] args) {
        /**
         * 证明选择排序不稳：按照年龄排序
         * 第一次遍历tiger0要tiger4交换位置，这时tiger0就跑到了tiger3后面，导致最终排序结果不稳定
         */
        Person[] persons = new Person[]{
                new Person("tiger0",19),
                new Person("tiger1",20),
                new Person("tiger2",21),
                new Person("tiger3",19),
                new Person("tiger4",18),
        };
        selectionSort(persons);

    }

    public static void selectionSort(Person[] ints){
        System.out.println("选择排序前："+ Arrays.toString(ints));
        for (int j = 0; j <ints.length -1; j++) {
            int min=j;
            //这层循环主要是为了找出数组最小的下标；
            for (int i = j+1; i < ints.length; i++) {
                if(ints[i].getAge()<ints[min].getAge()){
                    min = i;
                }
            }
            //交换
            Person temp = ints[j];
            ints[j] = ints[min];
            ints[min] =temp;
            System.out.println("第"+(j+1)+"次排序后："+Arrays.toString(ints));
        }
        System.out.println("选择排序后："+Arrays.toString(ints));
    }


    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }



}

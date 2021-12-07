package com.it.study.tee;

public class Test7 {
    public static void main(String[] args) {
        int[] all = {4,5,2,1,3,8,6,3};
        MyArrays.print(all);
        MyArrays.sort(all);
        MyArrays.print(all);
        int index= MyArrays.indexof(all,4);
        System.out.println("4在数组的下标是："+index);
        System.out.println("新数组：");
        int[] copyArr = MyArrays.copy(all,10);
        MyArrays.print(copyArr);

    }
}

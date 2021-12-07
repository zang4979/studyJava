package com.it.study.tee;

public class MyArrays {
    static void sort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] >arr[j+1]){
                    int temp =arr[j+1];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;


                }

            }

        }
    }
    static int indexof(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (value ==arr[i]) {
                return i;

            }

        }
        return -1;
    }
    static int[] copy(int[] arr, int len){
        int[] newArr = new int[len];
        for (int i = 0; i < newArr.length&&i<arr.length; i++) {
            newArr[i]=arr[i];


        }
        return newArr;
    }
    static void print(int[] arr){
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.println(arr[i]);
            }else {
                System.out.println(","+arr[i]);
            }

        }
        System.out.println("]");
    }
}

package com.penn.algorithm.sort;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void main(String args[]){
        int[] arrays = new int[10];
        int i;
        for(i =0 ;i<10;i++){
            arrays[i] = (int)(100+Math.random()*100);
        }
        System.out.println("初始化");
        printArrays(arrays);
        System.out.println("=======开始排序============");
        insertionSortArrays(arrays);
        System.out.println("=======结束排序============");
        printArrays(arrays);
    }

    private static void printArrays(int[] arys){
        for(int i =0;i< arys.length;i++){
            System.out.print(arys[i]+"，");
        }
        System.out.println("\n");
    }

    private static void insertionSortArrays(int[] arys){
        int i,j;
        int temp;
        for(i = 1;i<arys.length;i++){
            j = i;
            temp = arys[i];
            while(j >0 && temp < arys[j -1]){
                arys[j] = arys[j-1];
                j--;
            }
            arys[j] = temp;
            System.out.println("a circle finished");
            printArrays(arys);
        }
    }

}

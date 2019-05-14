package com.penn.algorithm.sort;

/**
 * 冒泡排序
 * 相邻的元素比较
 */
public class BubbleSort {
    public static void main(String args[]){
        int[] arrays = new int[10];
        int i;
        for(i =0 ;i<10;i++){
            arrays[i] = (int)(100+Math.random()*100);
        }
        System.out.println("初始化");
        printArrays(arrays);
        System.out.println("=======开始排序============");
        bubbleSortArrays(arrays);
        System.out.println("=======结束排序============");
        printArrays(arrays);
    }

    private static void printArrays(int[] arys){
        for(int i =0;i< arys.length;i++){
            System.out.print(arys[i]+"，");
        }
        System.out.println("\n");
    }

    private static void bubbleSortArrays(int[] arys){

        int temp;
        for(int i =1;i< arys.length;i++){
            for(int j=0;j<arys.length -1;j++){
                if(arys[j] > arys[j+1]){
                    temp = arys[j];
                    arys[j] = arys[j+1];
                    arys[j+1] =temp;
                }
                System.out.println("a step");
                printArrays(arys);
            }
            System.out.println("a circle finished");
            printArrays(arys);
        }
    }


}

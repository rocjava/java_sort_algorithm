package com.penn.algorithm.sort;

public class SelectionSort {

    public static void main(String args[]){
        int[] arrays = new int[10];
        int i;
        for(i =0 ;i<10;i++){
            arrays[i] = (int)(100+Math.random()*100);
        }
        System.out.println("初始化");
        printArrays(arrays);
        System.out.println("=======开始排序============");
        selectionSortArrays(arrays);
        System.out.println("=======结束排序============");
        printArrays(arrays);
    }

    private static void printArrays(int[] arys){
        for(int i =0;i< arys.length;i++){
            System.out.print(arys[i]+"，");
        }
        System.out.println("\n");
    }

    private static void selectionSortArrays(int[] arys){

        int index;
        int temp;
        for(int i=0;i<arys.length-1;i++){
            index = i;
            for(int j=i+1;j<arys.length;j++){
                if(arys[index] > arys[j]){
                    index = j;
                }
            }
            if(index != i){
                temp = arys[i];
                arys[i] = arys[index];
                arys[index] = temp;
            }
            System.out.println("a circle finished");
            printArrays(arys);
        }
    }
}

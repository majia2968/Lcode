package com.agile.practice.easy;

import java.util.Arrays;

public class Sorting {
    static int[] arr = {23,6,4,6,12,8,34,2,9};
    static int[] tempArray = new int[arr.length];
    public static void main(String[] args) {
        //int[] arr = {23,6,4,6,12,8,34,2,9};
        //bubbleSort(arr);
        mergeSort1(0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1,3,4,7,33};
        int[] arr1 = {2,4,6,8};
        System.out.println(Arrays.toString(mergeArray(arr2, arr1)));
    }

    static void mergeSort1(int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            mergeSort1(left, mid);
            mergeSort1(mid+1, right);
            merge2(left, mid, right);
        }
    }

    static void merge2(int l, int m, int r) {
        int lIndex = 0;
        int rIndex = 0;
        int k = 0;
        int[] arr1 = new int[m];
        int[] arr2 = new int[r-m];

        for (int c = 0; c < arr1.length; c++) {
            arr1[c] = arr[c];
        }
        for (int v = 0; v < arr2.length; v++) {
            arr2[v] = arr[m+v];
        }

        while (lIndex < m && rIndex < r-m) {
            if (arr1[lIndex] < arr2[rIndex]) {
                arr[k++] = arr1[lIndex++];
            }
            else {
                arr[k++] = arr2[rIndex++];
            }
            while (lIndex < m) {
                arr[k++] = arr1[lIndex++];
            }
            while (rIndex < r-m) {
                arr[k++] = arr2[rIndex++];
            }
        }
    }











    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i,j,arr);
                }
            }
        }
    }

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void mergeSort(int arr[], int l, int r) {
        int m = (l + r) / 2;
        if (l < r) {
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(l, m, r);
        }
    }

    static void merge(int l, int m, int r) {
        int i = l;
        int j = m+1;
        int k = l;
        //int[] tempArr = new int[arr.length];

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                tempArray[k++] = arr[i++];
            }
            else {
                tempArray[k++] = arr[j++];
            }
        }
        while (i <= m) {
            tempArray[k++] = arr[i++];
        }
        while (j <= r) {
            tempArray[k++] = arr[j++];
        }
        for (int f = l; f <=r; f++) {
            arr[f]=tempArray[f];
        }
    }


    private static void merge1(int start, int mid, int end) {
        // Initializing temp array and index
        //int[] tempArray=new int[arr.length];
        int tempArrayIndex=start;

        System.out.print("Before Merging:  ");
        //printArray(arr,start,end);

        int startIndex=start;
        int midIndex=mid+1;

        // It will iterate until smaller list reaches to the end
        while(startIndex<=mid && midIndex<=end)
        {
            if(arr[startIndex]< arr[midIndex])
            {
                tempArray[tempArrayIndex++]=arr[startIndex++];
            }
            else
            {
                tempArray[tempArrayIndex++]=arr[midIndex++];
            }
        }

        // Copy remaining elements
        while(startIndex<=mid)
        {
            tempArray[tempArrayIndex++]=arr[startIndex++];
        }
        while(midIndex<=end)
        {
            tempArray[tempArrayIndex++]=arr[midIndex++];
        }

        // Copy tempArray to actual array after sorting
        for (int i = start; i <=end; i++) {
            //arr[i]=tempArray[i];
        }

        System.out.print("After merging:   ");
        //printArray(tempArray,start,end);
        System.out.println();
    }












    static int[] mergeArray(int arr[], int prr[]) {
        int[] newArr = new int[arr.length + prr.length];
        int i = 0;
        int j = 0;
        int m = 0;
        int l = arr.length;
        int r = prr.length;
        while (i < l && j < r) {
            if (arr[i] < prr[j]) {
                newArr[m++] = arr[i++];
            }
            else {
                newArr[m++] = prr[j++];
            }
        }
        while (i < l) {
            newArr[m++] = arr[i++];
        }
        while (j < r) {
            newArr[m++] = prr[j++];
        }
        return newArr;
    }

}


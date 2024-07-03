package org.kparlar.dsa.search;

public class TernarySearch {

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 11;
        int first = 0;
        int last = arr.length - 1;


        int index = search(arr, key, first, last);
        if(index > 0)
            System.out.println(String.format("Index is: %s", index));
        else
            System.out.println(String.format("Key %s is not found in the array", key));

    }

    public static int search(int []arr, int key, int first, int last){
        int firstMid = first + ((last - first) /3);
        int secondMid = last - ((last - first) /3);

        if(first <= last){
         if(arr[firstMid] == key){
            return firstMid;
         }else if(arr[secondMid] == key){
            return secondMid;
         }else if(key < arr[firstMid] ){
            last = firstMid -1 ;
            return search(arr, key, first, last);
         }else if(  key<arr[secondMid]){
            first = firstMid+1;
            last = secondMid - 1;
            return search(arr, key,first, last);
         }else {
             //arr[secondMid]<key
             first = secondMid + 1;
             return search(arr, key, first, last);
         }
        }else return -1;
    }
}

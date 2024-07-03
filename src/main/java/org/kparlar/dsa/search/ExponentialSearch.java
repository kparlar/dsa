package org.kparlar.dsa.search;

public class ExponentialSearch {
    public static void main(String args[]){

        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int index  = search(arr, key);
        if(index > 0)
            System.out.println(String.format("Index is: %s", index));
        else
            System.out.println(String.format("Key %s is not found in the array", key));
    }
    public static int search(int []arr, int key){
        int index = 1;
        while(arr[index]<key && index< arr.length-1){
            index *=2;
        }
        int low = index/2;
        int high = index;

        return searchBinary(arr, key, low, high);
    }
    public static int searchBinary(int []arr, int key,int low, int high){
        int mid = (high+low)/2;

        if(arr[mid]==key){
            return mid;
        }
        if(low == high) {
            return -1;
        }
        if(arr[mid]>key){
            high = mid-1;
            return searchBinary(arr,key, low, high);
        }else{
            low = mid+1;
            return searchBinary(arr, key, low, high);
        }

    }
}

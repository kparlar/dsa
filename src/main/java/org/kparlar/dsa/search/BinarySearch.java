package org.kparlar.dsa.search;

public class BinarySearch {

    public static void main(String args[]){

        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int left = 0;
        int right = arr.length -1;
        int mid = (right + left) / 2;
        int index = search(arr, key, left, right, mid);

        if(index > 0)
            System.out.println(String.format("Index is: %s", index));
        else
            System.out.println(String.format("Key %s is not found in the array", key));
    }

    public static int search(int []arr, int key, int left, int right, int mid){
        if(left == right)
            return -1;
        else if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            left = mid+1;
            mid = (right + left) / 2;
            return search(arr, key, left, right, mid);
        }else {
            right = mid-1;
            mid = (right + left) / 2;
            return search(arr, key, left, right, mid);
        }
    }
}

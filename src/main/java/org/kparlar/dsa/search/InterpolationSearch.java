package org.kparlar.dsa.search;

public class InterpolationSearch {
    public static void main(String args[]){

        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int n = arr.length -1;
        int key = 18;
        int index = search(arr, 0, n, key);
        if(index > 0)
            System.out.println(String.format("Index is: %s", index));
        else
            System.out.println(String.format("Key %s is not found in the array", key));

    }

    public static int search(int arr[], int low, int high, int key){

        if(low <=high && key>=arr[low] && key <= arr[high]){

            int index = low + (((high - low ) / (arr[high]-arr[low])) * (key - arr[low]));
            if(arr[index] == key){
                return index;
            }
            if(arr[index] < key){
                return search(arr, index+1, high, key);
            }else{
                //arr[index]>key
                return search(arr, low, index-1, key);
            }
        }else return -1;

    }
}

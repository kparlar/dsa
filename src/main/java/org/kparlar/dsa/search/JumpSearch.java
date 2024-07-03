package org.kparlar.dsa.search;

public class JumpSearch {
    public static void main(String args[]){
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int key = 1;
        int index = search(arr, key);
        if(index > 0)
            System.out.println(String.format("Index is: %s", index));
        else
            System.out.println(String.format("Key %s is not found in the array", key));

    }
    public static int search(int arr[], int key){
        int n = arr.length-1;
        int jump = (int) Math.floor(Math.sqrt(n));
        int searchIndex = jump;
        while(arr[searchIndex]<key){
            searchIndex = Math.min(searchIndex+jump, n);
            if(searchIndex == n)
                break;
        }
        searchIndex = searchIndex - jump;
        while(searchIndex <=n){
            if(arr[searchIndex] == key)
                return searchIndex;
            searchIndex++;
        }
        return -1;
    }
}

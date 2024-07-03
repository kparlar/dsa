# Sort Algorithms

Sorting algorithms are used to arranging the elements of a list in a specific order, such as numerical or alphabetical. It organizes the items in a systematic way, 
making it easier to search for and access specific elements.

There are a lot of different types of sorting algorithms. Some widely used algorithms are:
* Selection Sort:	Finds the minimum element in the unsorted portion of the list and swaps it with the first element. Repeats this process until the entire list is sorted.
* Bubble Sort: 	Iteratively compares adjacent elements and swaps them if they are out of order. The largest element “bubbles” to the end of the list with each pass.
* Insertion Sort:	Builds the sorted list one element at a time by inserting each unsorted element into its correct position in the sorted portion.
* Quick Sort:	A divide-and-conquer algorithm that selects a pivot element, partitions the list into two sublists based on the pivot, and recursively applies the same process to the sublists.
* Merge Sort:	Another divide-and-conquer algorithm that recursively divides the list into smaller sublists, sorts them, and then merges them back together to obtain the sorted list.


## Selection Sort
Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.
The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part. 
This process is repeated for the remaining unsorted portion until the entire list is sorted. 

### How does Selection Sort Algorithm work?
Lets consider the following array as an example: arr[] = {64, 25, 12, 22, 11}
#### First pass:
* For the first position in the sorted array, the whole array is traversed from index 0 to 4 sequentially. The first position where 64 is stored presently, after traversing whole array it is clear that 11 is the lowest value.
* Thus, replace 64 with 11. After one iteration 11, which happens to be the least value in the array, tends to appear in the first position of the sorted list.
![Select Sort 1](/documents/img/sort/selection_sort-1.png?raw=true "Selection Sort 1")
#### Second Pass:
* For the second position, where 25 is present, again traverse the rest of the array in a sequential manner.
* After traversing, we found that 12 is the second lowest value in the array and it should appear at the second place in the array, thus swap these values.
![Select Sort 2](/documents/img/sort/selection_sort-2.png?raw=true "Selection Sort 2")
#### Third Pass:
* Now, for third place, where 25 is present again traverse the rest of the array and find the third least value present in the array.
* While traversing, 22 came out to be the third least value and it should appear at the third place in the array, thus swap 22 with element present at third position.
![Select Sort 3](/documents/img/sort/selection_sort-3.png?raw=true "Selection Sort 3")
#### Fourth pass:
* Similarly, for fourth position traverse the rest of the array and find the fourth least element in the array
* As 25 is the 4th lowest value hence, it will place at the fourth position.
![Select Sort 4](/documents/img/sort/selection_sort-4.png?raw=true "Selection Sort 4")
#### Fifth Pass:
* At last the largest value present in the array automatically get placed at the last position in the array
* The resulted array is the sorted array.
![Select Sort 5](/documents/img/sort/selection_sort-5.png?raw=true "Selection Sort 5")

### Complexity Analysis of Selection Sort
* Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops:
* One loop to select an element of Array one by one = O(N)
* Another loop to compare that element with every other Array element = O(N)
* Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)
* Auxiliary Space: O(1) as the only extra memory used is for temporary variables while swapping two values in Array. The selection sort never makes more than O(N) swaps and can be useful when memory writing is costly.

### Advantages of Selection Sort Algorithm
* Simple and easy to understand.
* Works well with small datasets.
### Disadvantages of the Selection Sort Algorithm
* Selection sort has a time complexity of O(n^2) in the worst and average case.
* Does not work well on large datasets.
* Does not preserve the relative order of items with equal keys which means it is not stable.

## Recursive Selection Sort
The Selection Sort algorithm sorts maintain two parts.

* The first part that is already sorted
* The second part is yet to be sorted.
The algorithm works by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the end of the sorted part.

* arr[] = 64 25 12 22 11

* // Find the minimum element in arr[0...4]
* // and place it at beginning
* 11 25 12 22 64

* // Find the minimum element in arr[1...4]
* // and place it at beginning of arr[1...4]
* 11 12 25 22 64

* // Find the minimum element in arr[2...4]
* // and place it at beginning of arr[2...4]
* 11 12 22 25 64

* // Find the minimum element in arr[3...4]
* // and place it at beginning of arr[3...4]
* 11 12 22 25 64

The idea of a recursive solution is to one by one increment sorted part and recursively call for the remaining (yet to be sorted) part.
### Complexity Analysis
* Time Complexity: O(n2)
* Auxiliary Space: O(n)

## Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

### Bubble Sort Algorithm
In Bubble Sort algorithm,  traverse from left and compare adjacent elements and the higher one is placed at right side.
In this way, the largest element is moved to the rightmost end at first.
This process is then continued to find the second largest and place it and so on until the data is sorted.
### How does Bubble Sort Work?
Input: arr[] = {6, 0, 3, 5}
#### First Pass:
The largest element is placed in its correct position, i.e., the end of the array.
![Bubble Sort 1](/documents/img/sort/bubble_sort-1.png?raw=true "Bubble Sort 1")
#### Second Pass:
Place the second largest element at correct position
![Bubble Sort 2](/documents/img/sort/bubble_sort-2.png?raw=true "Bubble Sort 2")
#### Third Pass:
Place the remaining two elements at their correct positions.
![Bubble Sort 3](/documents/img/sort/bubble_sort-3.png?raw=true "Bubble Sort 3")
* Total no. of passes: n-1
* Total no. of comparisons: n*(n-1)/2

## Insertion Sort
Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. 
It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output.
Insertion sort is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards.
Then, you pick a card from the unsorted group and put it in the right place in the sorted group.
### Algorithm
To achieve insertion sort, follow these steps:

* We have to start with second element of the array as first element in the array is assumed to be sorted.
* Compare second element with the first element and check if the second element is smaller then swap them.
* Move to the third element and compare it with the second element, then the first element and swap as necessary to put it in the correct position among the first three elements.
* Continue this process, comparing each element with the ones before it and swapping as needed to place it in the correct position among the sorted elements.
* Repeat until the entire array is sorted.

### Working of Insertion Sort Algorithm
Consider an array having elements : {23, 1, 10, 5, 2}
![Insertion Sort 1](/documents/img/sort/insertion_sort-1.png?raw=true "Insertion Sort 1")
#### First Pass:
* Current element is 23
* The first element in the array is assumed to be sorted.
* The sorted part until 0th index is : [23]
#### Second Pass:
* Compare 1 with 23 (current element with the sorted part).
* Since 1 is smaller, insert 1 before 23 .
* The sorted part until 1st index is: [1, 23]
#### Third Pass:
* Compare 10 with 1 and 23 (current element with the sorted part).
* Since 10 is greater than 1 and smaller than 23 , insert 10 between 1 and 23 .
* The sorted part until 2nd index is: [1, 10, 23]
#### Fourth Pass:
* Compare 5 with 1 , 10 , and 23 (current element with the sorted part).
* Since 5 is greater than 1 and smaller than 10 , insert 5 between 1 and 10 .
* The sorted part until 3rd index is : [1, 5, 10, 23]
#### Fifth Pass:
* Compare 2 with 1, 5, 10 , and 23 (current element with the sorted part).
* Since 2 is greater than 1 and smaller than 5 insert 2 between 1 and 5 .
* The sorted part until 4th index is: [1, 2, 5, 10, 23]
#### Final Array:
* The sorted array is: [1, 2, 5, 10, 23]

### Complexity Analysis
* Time Complexity: O(N^2)
* Auxiliary Space: O(1), Insertion sort requires O(1) additional space, making it a space-efficient sorting algorithm.

* Best case: O(n) , If the list is already sorted, where n is the number of elements in the list.
* Average case: O(n 2 ) , If the list is randomly ordered
* Worst case: O(n 2 ) , If the list is in reverse order
### Advantages
* Simple and easy to implement.
* Stable sorting algorithm.
* Efficient for small lists and nearly sorted lists.
* Space-efficient.
### Disadvantages
* Inefficient for large lists.
* Not as efficient as other sorting algorithms (e.g., merge sort, quick sort) for most cases.
### Applications
Insertion sort is commonly used in situations where:
* The list is small or nearly sorted.
* Simplicity and stability are important.

## Quick Sort
QuickSort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot 
and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array.
### How does QuickSort work?
The key process in quickSort is a partition() . The target of partitions is to place the pivot (any element can be chosen to be a pivot) at its correct position in the sorted array and put all smaller elements to the left of the pivot, and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed in its correct position and this finally sorts the array.
![Quick Sort 1](/documents/img/sort/quick_sort-1.png?raw=true "Quick Sort 1")
### Choice of Pivot:
There are many different choices for picking pivots.
* Always pick the first element as a pivot .
* Always pick the last element as a pivot (implemented below)
* Pick a random element as a pivot .
* Pick the middle as the pivot.

The logic is simple, we start from the leftmost element and keep track of the index of smaller (or equal) elements as i . 
While traversing, if we find a smaller element, we swap the current element with arr[i]. Otherwise, we ignore the current element.
Let us understand the working of partition and the Quick Sort algorithm with the help of the following example:
* Consider: arr[] = {10, 80, 30, 90, 40}.
* Compare 10 with the pivot and as it is less than pivot arrange it accordingly.
![Quick Sort 2](/documents/img/sort/quick_sort-2.png?raw=true "Quick Sort 2")
* Compare 80 with the pivot. It is greater than pivot.
![Quick Sort 3](/documents/img/sort/quick_sort-3.png?raw=true "Quick Sort 3")
* Compare 30 with pivot. It is less than pivot so arrange it accordingly.
![Quick Sort 4](/documents/img/sort/quick_sort-4.png?raw=true "Quick Sort 4")
* Compare 90 with the pivot. It is greater than the pivot.
![Quick Sort 5](/documents/img/sort/quick_sort-5.png?raw=true "Quick Sort 5")
* Arrange the pivot in its correct position.
![Quick Sort 6](/documents/img/sort/quick_sort-6.png?raw=true "Quick Sort 6")
### Illustration of Quicksort
As the partition process is done recursively, it keeps on putting the pivot in its actual position in the sorted array. Repeatedly putting pivots in their actual position makes the array sorted.
Follow the below images to understand how the recursive implementation of the partition algorithm helps to sort the array.
* Initial partition on the main array:
![Quick Sort 7](/documents/img/sort/quick_sort-7.png?raw=true "Quick Sort 7")
* Partitioning of the subarrays:
![Quick Sort 8](/documents/img/sort/quick_sort-8.png?raw=true "Quick Sort 8")

Quick Sort is a crucial algorithm in the industry, but there are other sorting algorithms that may be more optimal in different cases.
Complexity Analysis of Quick Sort :
### Time Complexity:
* Best Case : Ω (N log (N))
* * The best-case scenario for quicksort occur when the pivot chosen at the each step divides the array into roughly equal halves.
* * In this case, the algorithm will make balanced partitions, leading to efficient Sorting.
* Average Case: θ ( N log (N))
* * Quicksort’s average-case performance is usually very good in practice, making it one of the fastest sorting Algorithm.
* Worst Case: O(N2)
* * The worst-case Scenario for Quicksort occur when the pivot at each step consistently results in highly unbalanced partitions. 
When the array is already sorted and the pivot is always chosen as the smallest or largest element. To mitigate the worst-case Scenario, various techniques are used such as choosing 
a good pivot (e.g., median of three) and using Randomized algorithm (Randomized Quicksort ) to shuffle the element before sorting.
* Auxiliary Space: O(1), if we don’t consider the recursive stack space. If we consider the recursive stack space then, in the worst case quicksort could make O ( N ).
### Advantages of Quick Sort:
* It is a divide-and-conquer algorithm that makes it easier to solve problems.
* It is efficient on large data sets.
* It has a low overhead, as it only requires a small amount of memory to function.
### Disadvantages of Quick Sort:
* It has a worst-case time complexity of O(N 2 ), which occurs when the pivot is chosen poorly.
* It is not a good choice for small data sets.
* It is not a stable sort, meaning that if two elements have the same key, their relative order will not be preserved in the sorted output in case of quick sort, 
because here we are swapping elements according to the pivot’s position (without considering their original positions).
## Merge Sort
Merge sort is a sorting algorithm that follows the divide-and-conquer approach. It works by recursively dividing the input array into smaller subarrays and sorting those subarrays then merging them back together to obtain the sorted array.
In simple terms, we can say that the process of merge sort is to divide the array into two halves, sort each half, and then merge the sorted halves back together. This process is repeated until the entire array is sorted.
### How does Merge Sort work?
Merge sort is a popular sorting algorithm known for its efficiency and stability. It follows the divide-and-conquer approach to sort a given array of elements.
Here’s a step-by-step explanation of how merge sort works:
* Divide: Divide the list or array recursively into two halves until it can no more be divided.
* Conquer: Each subarray is sorted individually using the merge sort algorithm.
* Merge: The sorted subarrays are merged back together in sorted order. The process continues until all elements from both subarrays have been merged.
### Illustration of Merge Sort:
Let’s sort the array or list [38, 27, 43, 10] using Merge Sort

![Merge Sort 1](/documents/img/sort/merge_sort-1.png?raw=true "Merge Sort 1")
![Merge Sort 2](/documents/img/sort/merge_sort-2.png?raw=true "Merge Sort 2")
![Merge Sort 3](/documents/img/sort/merge_sort-3.png?raw=true "Merge Sort 3")
![Merge Sort 4](/documents/img/sort/merge_sort-4.png?raw=true "Merge Sort 4")
Let’s look at the working of above example:
#### Divide:
* [38, 27, 43, 10] is divided into [38, 27 ] and [43, 10] .
* [38, 27] is divided into [38] and [27] .
* [43, 10] is divided into [43] and [10] .
#### Conquer:
* [38] is already sorted.
* [27] is already sorted.
* [43] is already sorted.
* [10] is already sorted.
#### Merge:
* Merge [38] and [27] to get [27, 38] .
* Merge [43] and [10] to get [10,43] .
* Merge [27, 38] and [10,43] to get the final sorted list [10, 27, 38, 43]
* Therefore, the sorted list is [10, 27, 38, 43] .

### Complexity Analysis of Merge Sort:
#### Time Complexity:
* Best Case: O(n log n), When the array is already sorted or nearly sorted.
* Average Case: O(n log n), When the array is randomly ordered.
* Worst Case: O(n log n), When the array is sorted in reverse order.
* Space Complexity: O(n), Additional space is required for the temporary array used during merging.

### Applications of Merge Sort:
* Sorting large datasets
* External sorting (when the dataset is too large to fit in memory)
* Inversion counting (counting the number of inversions in an array)
* Finding the median of an array
### Advantages of Merge Sort:
* Stability : Merge sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the input array.
* Guaranteed worst-case performance: Merge sort has a worst-case time complexity of O(N logN) , which means it performs well even on large datasets.
* Simple to implement: The divide-and-conquer approach is straightforward. 
### Disadvantages of Merge Sort:
* Space complexity: Merge sort requires additional memory to store the merged sub-arrays during the sorting process.
* Not in-place: Merge sort is not an in-place sorting algorithm, which means it requires additional memory to store the sorted data. This can be a disadvantage in applications where memory usage is a concern.
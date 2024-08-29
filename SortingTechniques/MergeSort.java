// Question : https://www.youtube.com/watch?v=aiUHB-3EOg8&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=5

if(lo == hi){
    int [] baseArr = new int[1];
    baseArr[0] = arr[lo];
    return baseArr;
}


int mid = (lo + hi)/2;
int[] firstSortedArrayHalf = mergeSort(arr, lo, mid);
int [] secongSortedArrayHalf = mergeSort(arr, mid+1, hi);
int [] fullSortedArray = mergeTwoSortedArray(firstSortedArrayHalf , secongSortedArrayHalf); // done in previous question

return fullSortedArray;
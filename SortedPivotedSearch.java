class SortedPivotedSearch{
    int spsfunc(int[] arr, int size, int key){
        int pivot=findPivot(arr,0,size-1);
        if(key==arr[pivot]){
            return pivot; 
        }
        if(key>=arr[0]){
            return binarySearch(arr,0,pivot,key);
        }
        if(key<arr[0]){
            return binarySearch(arr,pivot+1,size-1,key);
        }
        return -1;
    }
    int findPivot(int arr[], int start, int end)
    {
        if (end < start)
            return -1;
        if (end == start)
            return start;
        int mid = (start + end)/2;
        if (mid < end && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > start && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[start] >= arr[mid])
            return findPivot(arr, start, mid - 1);
        return findPivot(arr, mid + 1, end);
    }
    int binarySearch(int arr[], int start, int end, int key)
    {
        if (end < start)
            return -1;

        int mid = (start + end) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), end, key);
        return binarySearch(arr, start, (mid - 1), key);
    }
}
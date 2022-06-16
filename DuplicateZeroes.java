class DuplicateZeroes {
    public void duplicateZeros(int[] arr){
        int count = 0, n = arr.length;
        //Counting number of zeros in array
        for(int i: arr)
            if(i == 0)
                ++count;
        //
        for(int i = n - 1, j = n - 1 + count; i >= 0; --i, --j){
            //
            if(arr[i] == 0) {
                //
                if(j < n)
                    arr[j] = 0;
                --j;
            }
            //
            if(j < n)
                arr[j] = arr[i];
        }
    }
}

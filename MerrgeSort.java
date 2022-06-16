class MerrgeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Merging array as per given condition
        for(int i=m;i<m+n;i+=1){
            nums1[i]=nums2[i-m];
        }
        //SortingArray
        for (int i = 0; i < nums1.length; i++) {     
            for (int j = i+1; j < nums1.length; j++) {     
                if(nums1[i] > nums1[j]) {    
                    int temp = nums1[i];    
                    nums1[i] = nums1[j];    
                    nums1[j] = temp;    
                }     
            }     
        }      
    }
}
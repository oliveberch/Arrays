class RemoveElement{
    public int removeElement(int[] nums, int val) {
        int index = nums.length - 1;
        int[] arr= new int[nums.length];
        //iterate through array
        for(int i=0,j=0;i<nums.length-1;i++){
            //If number is the one we want to delete, Reduce index size
            if(nums[i]==val){
                index -= 1;
            }
            else{ //Add element to array
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<index;i+=1){
            nums[i]=arr[i];
        }
        return index;
    }
}


class MoveZeroes{
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i+=1){
            if(nums[i]%2!=0&&nums[i+1]%2==0){
                int oe = nums[i];
                for(int j=i+1;j<nums.length;i+=1){
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1]=oe;
            }
            if(nums[i]%2!=0&&nums[i+1]%2!=0){
                int oe = nums[i];
                for(int j=i+1;j<nums.length;i+=1){
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1]=oe;
                i-=1;
            }
        }
    }
}
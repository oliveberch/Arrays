class MountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int m=0;
        //Finding Index of Max Element
        for(int i=0;i<arr.length;i+=1){
            if(arr[i]>arr[m]){
                m=i;
            }
        }
        //checking Specific Case
        if(m==0 || m==arr.length-1){
            return false;
        }
        //Index 0 to m.
        for(int i=0;i<m;i+=1){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        //Index m to arr.length-1
        for(int i=m;i<arr.length-1;i+=1){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
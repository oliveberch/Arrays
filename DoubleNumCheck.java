/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 */
class DoubleNumCheck {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i+=1){
            for(int j=0;j<arr.length;j+=1){
                if(i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
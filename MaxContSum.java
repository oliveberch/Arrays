public class MaxContSum {
    int Solution(int [] arr, int n){
        int Sum=0;
        int checkSum=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<=n-i;j++){
                checkSum=0;
                for(int k=j;k<j+i;k++){
                    checkSum+=arr[k];
                }
            }
            if(checkSum>Sum){
                Sum=checkSum;
            } 
        }
    return Sum;   
    }    
}
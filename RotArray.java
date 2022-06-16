public class RotArray{
    void func(int[] arr, int d,int n){
        int[] temp=new int[d];
        //store d elements into Temp array
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        //shift elements
        for(int i=0;i<n-d;i++){
            arr[i]=arr[i+d];
        }
        //Add temp into arr
        int j=0;
        for(int i=n-d;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
    }
}
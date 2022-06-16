public class ReversalAlgo
{
    void revAlgo(int[] arr, int d, int n)
    {
        RevArrayRange(arr,0,d-1);
        RevArrayRange(arr,d,n-1);
        RevArrayRange(arr,0,n-1);
    }
    void RevArrayRange(int[] arr, int i, int j)
    {
        int temp=0;
        while(j>i)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=1;
            j-=1;
        }
    }
}
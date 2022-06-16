public class RevArray{
    static void revArray(int[] arr){
        int i=0,j=0,temp=0;
        j = arr.length - 1;
        while(j>i){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=1;
            j-=1;
        }
    }
    public static void main(String[] args){
        int [] a={3,5,6,7};
        for(int num : a)
        {
            System.out.print(num);
        }
        System.out.println();
        System.out.println("After Reversal: ");
        revArray(a);
        for(int num : a)
        {
            System.out.print(num);
        }
    }
}
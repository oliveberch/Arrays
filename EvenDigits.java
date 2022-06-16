public class EvenDigits
{
    public static void main(){
        int[] a={12,345,26,7896};
        System.out.println(findEvenDigitsNumbers(a));
    }
    public static int findEvenDigitsNumbers(int[] nums){
        int evenCount=0;
        for (int i:nums){
            int digits=0;
            while(i>0){
                i=i/10;
                digits+=1;
            }
            if(digits%2==0){
                evenCount+=1;
            }
        }
        return evenCount;
    }
}
public class DigsInNum
{
   public int countDigits(int a){
        int digits=0;
        while(a>0){
            a=a%10;
            digits+=1;
        }
        return digits;
    }
}

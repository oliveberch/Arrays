public class IntArray
{
    public static void main()
    {
        int[] SqNo = new int[10];
        //Write into array using for
        for(int i=0; i<10; i++)
        {
            int Sq = (i+1)*(i+1);
            SqNo[i] = Sq;
        }
        //Read from array using for each
        for(int Sq : SqNo)
        {
            System.out.println(Sq);
        }
    }
}
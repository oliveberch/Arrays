public class MaxConsOne
{
    public int findMaxConsecutiveOnes(int num[])
    {
        int MCNof1=0;
        int CNof1=0;
        for (int i:num)
        {
            if(i==1)
            {
                CNof1+=1;
                System.out.println(CNof1);
            }
            if(i==0 && CNof1>MCNof1)
            {
                MCNof1=CNof1;
                CNof1=0;
            }
        }
        if(CNof1>MCNof1)
        {
            MCNof1=CNof1;
        }
        return MCNof1;
    }
    public void main()
    {
        int[] arr = {0,0,1,1,0,0,1,1,1};
        System.out.print(findMaxConsecutiveOnes(arr));
    }
}


package mcs_bootcamp;

public class Multiples_3_5 
{
   public static void main(String[] args)
    {
        int m=0;
        for(int i=0;i<1000;i++)
        {
            if(i%3==0||i%5==0)
            {
                m+=i;
            }
        }
        System.out.println("Sum:"+m);
    }
}

import java.util.*;
import java.util.*;
class Misa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int i=0,j;
        int max=1,count=1;
        try{
        for(i=0;i<a.length()-1;i++)
        {
            j=i;
            count=1;
            while(a.charAt(j)==a.charAt(j+1))
            {
                count++;
                j++;
            }
            if (count>max)
                max=count;
        }
        }
        catch(Exception e)
        {
	//System.out.println("Exception :"+count);
            if (count>max)
                max=count;
        }
        System.out.println(max);
    }
}
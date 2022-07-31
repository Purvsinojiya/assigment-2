import java.util.*;
public class Practical4{
    void function()
    {
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        int b=sc.nextInt();
        int i;
        for(i=0;i<b;i++) {
            a[i] = sc.nextInt();
        }
        int c=0;
        for (i=0;i<b-2;i++)
        {
            if (a[i]==1 && a[i+1]==2 && a[i+2]==3)
            {
                c++;
            }
        }
        if(c>0)
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void main(String[] args) {
        System.out.println("21ce135Sinojiya poorv");
        Practical4 obj1 = new Practical4();

    }
}

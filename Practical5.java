import java.util.*;
import java.lang.String;
import java.lang.Math;
public class Practical5{
    void function()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        String r;
        s = sc.next();
        r = sc.next();
        int w = s.length();
        int e = r.length();
        int j;
        j = Math.min(w,e);
        int count = 0;
        for (int i = 0; i < j-1; i++) {
            String aSub = s.substring(i, i + 2);
            String bSub = r.substring(i, i + 2);
            if (aSub.equals(bSub))
                count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("21ce135 Sinojiya Poorv");
       Practical5 obj1=new Practical5();
       obj1.function();
    }
        }


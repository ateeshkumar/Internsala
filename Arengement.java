import java.util.*;
public class Arengement{
    public void per(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                per(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args){
        System.out.print("Enter your Word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        Arengement perm = new Arengement();
        perm.per(str, 0, n-1);
    }
}
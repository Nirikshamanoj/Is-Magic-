import java.util.Scanner;
public class IsMagic {
    static int findMagicNumber(int n)
    {
        if(n<9)
            return n;
        return findMagicNumber((n/10)+(n%10));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        n=findMagicNumber(n);
        if(n==1)
            System.out.println(1);
        else
            System.out.println(0);
    }

}

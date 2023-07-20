import java.util.Scanner;
public class IsMagic {
    static int findMagicNumber(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n>=10) {
          n=findMagicNumber(n);
        }
        if(n==1)
            System.out.println(1);
        else
            System.out.println(0);
    }

}

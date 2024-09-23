import java.util.Scanner;

public class PalindromeBetweenULLL {
    public static int palindrome(int i) {
        int rem=0;
        int temp=i;
        while(temp!=0)
        {
            int r=temp%10;
            rem=(rem*10)+r;
            temp/=10;

        }
        return rem;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ul=sc.nextInt();
        int ll=sc.nextInt();
        for(int i=ul;i<=ll;i++)
        {
            if(i==palindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
  /*
  output:
  UL = 11
  LL = 80
  Palindrome starting from them is : 11,22,33,44,55,66,77*/

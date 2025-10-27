import java.util.Scanner;
class pali
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String str1=sc.nextLine();

        if(isPalindrome(str1))
        {
            System.out.println(str1+" is a palindrome");
        }
        else
    
            System.out.println(str1+" is not a palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(String str)
    {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
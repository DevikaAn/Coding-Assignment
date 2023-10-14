import java.util.Scanner;
public class Program_3 
{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input=scanner.nextLine().toLowerCase();
        boolean isPangram=checkPangram(input);
        if (isPangram) 
        {
            System.out.println("The sentence is a pangram");
        } 
        else 
        {
            System.out.println("The sentence is not a pangram");
        }
        scanner.close();
    }
    public static boolean checkPangram(String input) 
    {
        for (char letter='a';letter<='z';letter++) 
        {
            if (input.indexOf(letter)==-1) 
            {
                return false;
            }
        }
        return true;
    }
}

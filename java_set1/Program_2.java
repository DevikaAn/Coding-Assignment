import java.util.Scanner;

public class Program_2
 {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Roman letter:");
        String romanNo=scanner.nextLine().toUpperCase();
        int result=romanToInt(romanNo);
        System.out.println("The integer of "+romanNo+" is "+result);
        scanner.close();
    }
    public static int romanToInt(String rm) 
    {
        int result=0;
        for (int i=0;i<rm.length();i++) 
        {
            char cur_char=rm.charAt(i);
            int cur_value=getRomanValue(cur_char);
            if (i+1<rm.length())
             {
                char next_char=rm.charAt(i + 1);
                int next_value=getRomanValue(next_char);
                if (cur_value<next_value) 
                {
                    result-=cur_value;
                } 
                else 
                {
                    result+=cur_value;
                }
            } 
            else 
            {
                result+=cur_value;
            }
        }
        return result;
    }
    public static int getRomanValue(char ch) 
    {
        if (ch=='I') return 1;
        if (ch=='V') return 5;
        if (ch=='X') return 10;
        if (ch=='L') return 50;
        if (ch=='C') return 100;
        if (ch=='D') return 500;
        if (ch=='M') return 1000;
        return 0;
    }
}


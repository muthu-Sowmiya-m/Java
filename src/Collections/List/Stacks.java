import java.util.*;

//Balancing of paranthesis using stack class

public class Stacks
{
    static boolean IsBalanced(String expr)
    {
        Stack <Character> stk = new Stack<>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stk.push(x);
                continue;
            }
            //Skipping numbers
            else if (x > 0 && x <9 || x >'A' && x < 'Z')
            {
                continue;
            }

            char check;
            if (stk.isEmpty())
            {
                return false;
            }
            switch (x)
            {
                case ')':
                    check = stk.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stk.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stk.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }

        }
        return (stk.isEmpty());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paranthesis expression" );
        String expr = sc.nextLine();

        if (IsBalanced(expr))
        {
            System.out.println("Balanced ");}
        else{
            System.out.println("Not Balanced ");}
    }
}
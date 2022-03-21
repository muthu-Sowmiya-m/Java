import java.util.*;
import java.lang.*;

class Que
{
    String Value;
    Que(String val)
    {
        this.Value= val;
    }
}

public class Queues
{

    static void display(Queue Q)
    {
        //Traversing queue
        Iterator itr = Q.iterator();
        System.out.print("front<--   ");
        while (itr.hasNext()) {
            Que q = (Que) itr.next();
            System.out.print(q.Value);
            System.out.print("-->");
        }
        System.out.print("   rear  ");
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements " );
        int n = sc.nextInt();
        //array of objects
        Que obj[] = new Que[10];

        //implementation using linkedlist
        Queue <Que> Q = new LinkedList<Que>();

        System.out.println("Enter the Values" );
        for (int i = 0; i < n; i++)
        {
            String input = sc.next();
            obj[i] = new Que(input);
            Q.add(obj[i]);
        }
        System.out.println("Before Deletion" );
        display(Q);
        //getting the head element and removing elements in front
        Que res1 = Q.element();
        System.out.println("head:"+ res1.Value);
        Que res2 = Q.peek();
        System.out.println("head:"+ res2.Value);
        Que res3 = Q.remove();
        System.out.println("removed:"+ res3.Value);
        Que res4 = Q.poll();
        System.out.println("removed:"+ res4.Value);

        System.out.println("After Deletion" );
        display(Q);

        //Adding elements at rear end
        obj[6] = new Que("f");
        Q.add(obj[6]);
        System.out.println(" ");
        System.out.println("After Insertion" );
        display(Q);

    }
}
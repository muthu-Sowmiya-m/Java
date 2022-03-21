import java.util.*;

class Box
{
    int length,breadth;
    Box(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
}

public class LinkedList2
{
    public static void main(String args[])
    {
        //Array of Objects
        Box b[] = new Box[5];

        b[0] = new Box(12,5);
        b[1] = new Box(3,5);
        b[2] = new Box(32,4);

        //List to store Objects
        List <Box> boxes = new LinkedList<Box>();

        //Adding Objects to list
        boxes.add(b[0]);
        boxes.add(b[1]);
        boxes.add(b[2]);

        b[3] = new Box(2,4);
        boxes.add(b[3]);
        int i =0;
       for (Box itr : boxes)
        {
            System.out.println("The area of " + i +" box is " + itr.length * itr.breadth);
            i++;
        }

    }
}
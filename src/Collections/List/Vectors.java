import java.util.*;
//Implementing Bubble sort using vectors

public class Vectors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vector vect = new Vector(n);

        // Adding elements to vectors
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            vect.add(sc.nextInt());
        }

        //adding array to vectors as collections
        Integer arr[] = new Integer[]{21, 43, 2, 4, 7, 56, 43, 23};
        vect.addAll(List.of(arr));

        System.out.println("Before Sorting" + vect);

        for (int i = 0; i < vect.size(); i++) {
            for (int j = 0; j < vect.size() - i - 1; j++)
            {
                if ((int)vect.get(j + 1) < (int)vect.get(j))
                {
                    int swap = (int) vect.get(j);
                    vect.set(j, vect.get(j + 1));
                    vect.set(j + 1, swap);}
            }}
        System.out.println("After Sorting" + vect);
        }
    }


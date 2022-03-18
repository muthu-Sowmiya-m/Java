import java.util.*;

public class SearchAndSort
{
    public static void main(String args[]) {
        //Adding elements to the list
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList(n);
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        //Sorting
        System.out.println("Before Sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting");
        System.out.println(list);
        //Searching
        int index = Collections.binarySearch(list, 5);
        System.out.println("The element 5 is at index : " + index);
    }

    }
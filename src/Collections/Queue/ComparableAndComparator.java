//A Java program to demonstrate Comparator interface
import java.util.*;

// A class that implements Comparable
class CustomComparartorInPQ implements Comparable<CustomComparartorInPQ>
{
    private double rating;
    private String name;
    private int year;

    public CustomComparartorInPQ(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Used to sort movies by year
    public int compareTo(CustomComparartorInPQ m)
    {
        return this.year - m.year;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear()	 { return year; }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<CustomComparartorInPQ>
{
    public int compare(CustomComparartorInPQ m1, CustomComparartorInPQ m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<CustomComparartorInPQ>
{
    public int compare(CustomComparartorInPQ m1, CustomComparartorInPQ m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

class ComparableAndComparator
{
    public static void main(String[] args)
    {
        ArrayList<CustomComparartorInPQ> list = new ArrayList<CustomComparartorInPQ>();

        list.add(new CustomComparartorInPQ("Pirates of the Caribbean", 9.3, 2017));
        list.add(new CustomComparartorInPQ("Captain Marvel", 9.0, 2020));
        list.add(new CustomComparartorInPQ("Avengers", 9.2, 2018));
        list.add(new CustomComparartorInPQ("Spider Man", 9.5, 2021));


        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (CustomComparartorInPQ movie: list)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());



        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (CustomComparartorInPQ movie: list)
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (CustomComparartorInPQ movie: list)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName()+" ");
    }
}

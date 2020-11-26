import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> week = new ArrayList<String>();
        ArrayList<String> workingDay = new ArrayList<String>(Arrays.asList(
                "Lundi","Mardi","Mercredi","Jeudi","Vendredi"));
        ArrayList<String> weekend = new ArrayList<String>();

        weekend.add("Samedi");
        weekend.add("Dimanche");

        week.addAll(workingDay);
        week.addAll(5,weekend);

        //accessing and changing the element
        System.out.println("Replacing " +week.get(1) +" by Mardi...\n");
        week.set(1,"Mardi...");

        //different ways to display all days
        //1.Traversing list through Iterator
        Iterator itr=week.iterator();//getting the Iterator
        System.out.println("\n1.Display through Iterator");
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }

        //2.1 Traversing list through for-each loop
        System.out.println("\n2.1 Display through for-each loop");
        for(String day:week)
            System.out.println(day);

        //2.2 Traversing list through for-each loop with lambda expression
        System.out.println("\n2.2 Display through for-each loop with lambda expression");
        week.forEach((d)->System.out.println(d));

        //3.Traversing list through for loop
        System.out.println("\n3.Display through for loop:");
        for(int i=0;i<week.size();i++)
        {
            System.out.println(week.get(i));
        }

        //4.Traversing list through forEach() method with lambda expression
        System.out.println("\n4.Traversing list through forEach() method:");
        week.forEach(d->{ //Here, we are using lambda expression
            System.out.println(d);
        });

        //5.Traversing list through forEachRemaining() method with lambda expression
        System.out.println("\n5.Traversing list through forEachRemaining() " +
                "method:");
        Iterator<String> itr2=week.iterator();
        itr2.forEachRemaining(d-> //Here, we are using lambda expression
        {
            System.out.println(d);
        });

        //sort
        //Collections.sort(week);
    }
}

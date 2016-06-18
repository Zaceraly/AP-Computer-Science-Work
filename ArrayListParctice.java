import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice
{
  public static void main(String[]zane)
  {
    /*   declares an ArrayList variable   */
    ArrayList<String> names;
    /*   ArrayLists can only hold objects
         and the object type is part of the declaration statement  */
    names = new ArrayList<String>();
    /*   instantiates the ArrayList object, names
         add data to names   */
    names.add("Alex");
    names.add("Ryan");
    /*   print contents of ArrayList names   */
    System.out.println(names.get(0));
    System.out.println(names.get(1));
    System.out.println();
    /*   removes Alex from ArrayList names   */
    names.remove(0);
    /*   print contents of ArrayList names
         after having removed Alex(0)
         since there is no longer a 1 because 
         Ryan(1) moved down to fill Alex's spot 0
         YOu will get an Out-Of-Bounds error*/
    System.out.println(names.get(0));
    System.out.println();
    //System.out.println(names.get(1));
    /*   sets 0 index to Alan  
         Alan replaces Ryan in the ArrayList*/
    names.set(0,"Alan");
    System.out.println(names.get(0));
    System.out.println();
    names.add("Ryan");
    //names.set(2,"Chris");
    names.add(1,"Chris");
    /*   prints ArrayList in loop   */
    for(int i = 0;i<names.size();i++)
    {
      System.out.println(names.get(i));
    }
    /*   PRACTICE   */
    ArrayList<String> myList = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the names of your 5 closest friends");
    for(int i = 0; i<5; i++)
    {
      myList.add(input.next());
    }
    for(String x: myList)
    {
      System.out.println(x);
    }
    /*  removes the last entry regardless of size  */
    int s = myList.size();
    //myList.remove(s-1);
    System.out.print(myList.remove(0));
    System.out.println(myList);
    input.close();
  }
}

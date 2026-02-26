//We are going to create An ArrayList
import java.util.*;
public class Main{
   static void String()
    {
ArrayList<String> list=new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("JavaScript");
list.add("DSA");
System.out.println(list);
    }
    //Now I am going to create an another ArrayList for the Storing Integer values
    static void Integer()
    {
        ArrayList <Integer> percentages=new ArrayList <>();
        percentages.add(100);
        percentages.add(95);
        percentages.add(80);
        percentages.add(75);
        percentages.add(90);
        System.out.println(percentages);
    }
      //Now I am going to create an another ArrayList for the Storing Double values
      static void Double()
      {
ArrayList <Double> fl=new ArrayList <> ();
    fl.add(100.10);
        fl.add(95.5);
        fl.add(80.8);
        fl.add(75.9);
        fl.add(90.9);
        System.out.println(fl);
      }
    public static void main(String args[])
    {
        System.out.println("First Method is Called for the the String values");
String();
System.out.println("Second Method is called for the Integer values");
Integer();
System.out.println("Third Method is called for the Double values"); 
Double();
    }
}
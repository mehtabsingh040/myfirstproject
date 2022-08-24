

import java.util.*;


public class ArrayListAssignment {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Violet");
        Colors.add("Indigo");
        Colors.add("Blue");
        Colors.add("Green");
        Colors.add("Yellow");
        Colors.add("Orange");
        Colors.add("Red");
        Colors.add("Black");
        Colors.add("White");
        Colors.add("Grey");
        Colors.add("Silver");
        System.out.println(Colors);
        Iterator itr = Colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
            System.out.println("Enter the element to be added to the Arraylist.");
            Scanner sc = new Scanner(System.in);
            String newElement = sc.next();
            Colors.add(0, newElement);
        System.out.println(Colors);
        System.out.println("Enter the index of the element to be retrieved.");
        int x = sc.nextInt();
        System.out.println("The element is "+Colors.get(x));
        System.out.println("enter the index of the element to be replaced.");
        int x1 = sc.nextInt();
        System.out.println("What do you want to replace it with?");
        String y = sc.next();
        Colors.set(x1,y);
        System.out.println(Colors);
        System.out.println("Removal of third term.");
        Colors.remove(2);
        System.out.println(Colors);
        System.out.println("What element do you want ot search?");
        String y1 = sc.next();
        if (Colors.contains(y)==true) {
            System.out.print("Found!!!! ");
            System.out.println("The color "+y1+" is at "+ Colors.indexOf(y1));
        }
        else System.out.println("Not found");
        System.out.println("Sorting ArrayList");
        Collections.sort(Colors);
        System.out.println(Colors);
        int i = Colors.size();
        System.out.println("CLearing Arraylist");
        Colors.clear();
        System.out.println("Checking if the Array list is empty or not.");
        if (Colors.isEmpty()==true) System.out.println("Empty");
        else System.out.println("Not empty");
        }
    }






package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }

    }
    //--------------------------------------
// Do what the menu item calls for
//--------------------------------------
    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            //Adding a new element from the menu
            case 3: //adding the case of add an element
                System.out.print("Enter a value to add : ");
                int valAdd=scan.nextInt();
                list.addElement(valAdd);
                break;
            //Removing the first occurrence of an element
            case 4: //adding the case of removing the first occurrence of an element
                System.out.print("Enter a value to remove if exists : ");
                int valRemove=scan.nextInt();
                list.removeFirst(valRemove);
                break;
            //Removing all the occurrences of an element
            case 5:
                System.out.print("Enter a value to remove all its occurrences if they exist : ");
                int valRemoveAll=scan.nextInt();
                list.removeAll(valRemoveAll);
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //----------------------------
// Print the user's choices
//----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        //Adding option to the menu for adding
        System.out.println("3: Add an element");
        //Adding option to the menu for removing
        System.out.println("4:, Remove an element if exists ");
        //Adding option to the menu for removing all
        System.out.println("5:, Remove all occurrences of an element ");
        System.out.print("\nEnter your choice: ");
    }
}

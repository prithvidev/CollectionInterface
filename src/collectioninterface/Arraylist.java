package collectioninterface;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(ch <= 7){
            System.out.println("1)Add Element\n"+"2)Add Element at Specified Position\n"+"3)Remove Element from the Specified Position\n"
            +"4)Clear the List\n"+"5)Searching for Element\n"+"6)Size of the List\n"+"7)Display the List");
            System.out.println("\n");
            System.out.println("Enter Your Choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                {
                    System.out.println("Enter Element: ");
                    int h = sc.nextInt();
                    boolean y = arr.add(h);
                    if(y == true){
                    System.out.println("Added");}
                    else{System.out.println("Not Added");}
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the Position: ");
                    int p = sc.nextInt();
                    System.out.println("Enter the Element: ");
                    int h = sc.nextInt();
                    arr.add(p, h);
                    System.out.println("Added");
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the index of the Element to be Removed: ");
                    int h = sc.nextInt();
                    Integer u = arr.remove(h);
                    System.out.println("Element Removed from the List is: "+u);
                    break;
                }
                case 4:
                {
                    arr.clear();
                    System.out.println("Deleted All the Elements from the List");
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the element to be searched: ");
                    int h = sc.nextInt();
                    boolean i = arr.contains(h);
                    if(i == true){
                        System.out.println("List Contain that Element");
                    }
                    else{System.out.println("List don't Contain that Element");}
                    break;
                }
                case 6:
                {
                    System.out.println("SIze of the List is : "+arr.size());
                    break;
                }
                case 7:
                {
                    System.out.println("Elements in the List:\n");
                    ListIterator<Integer> li = arr.listIterator();
                    System.out.println("Displaying Elements in the Forward Direction:\n");
                    while(li.hasNext()){
                        int i = li.next();
                        System.out.print(i+" ");
                    }
                    System.out.println("\n");
                    System.out.println("Displaying Elements in the Backward Direction:\n");
                    while(li.hasPrevious()){
                        int ii = li.previous();
                        System.out.print(ii+" ");
                    }
                    System.out.println("\n");
                    break;
                }
                default:
                {
                    System.out.println("EXIT!");
                }
            
            }
        }
    }
}

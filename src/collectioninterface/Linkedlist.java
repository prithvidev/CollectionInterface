
package collectioninterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        LinkedList<Integer> ll = new LinkedList<Integer>();
        while(ch <= 10){
            System.out.println("1)ADD ELEMENT\n"+"2)ADD AT FIRST\n"+"3)ADD AT LAST\n"+"4)ADD AT SPECIFIED POSITION\n"+"5)REMOVE FIRST ELEMENT\n"+"6)REMOVE LAST ELEMENT\n"+"7)CLEAR THE LIST\n"
                    + "8)REPLACE ELEMENT AT SPECIFIED POSITION\n"+"9)SIZE OF LIST\n"+"10)DISPLAY THE LIST");
            System.out.println("ENTER YOUR CHOICE:");
            ch = sc.nextInt();
           switch(ch){
               case 1:
               {
                   System.out.println("Enter The Value:");
                   int y = sc.nextInt();
                   boolean t = ll.add(y);
                   if(t == true){System.out.println("ADDED");}
                   else{System.out.println("NOT ADDED");}
                   break;
               }
               case 2:
               {
                   int y = sc.nextInt();
                   ll.addFirst(y);
                   System.out.println("ADDED AT FIRST POSITION");
                   break;
               }
               case 3:
               {
                   int y = sc.nextInt();
                   ll.addLast(y);
                   System.out.println("ADDED AT LAST POSITION");
                   break;
               }
               case 4:
               {
                   System.out.println("Enter Position:");
                   int p = sc.nextInt();
                   System.out.println("Enter Value:");
                   int y = sc.nextInt();
                   ll.add(p, y);
                   System.out.println("ADDED AT"+p);
                   break;
               }
               case 5:
               {
                   ll.removeFirst();
                   System.out.println("REMOVED FIRST ELEMENT");
                   break;
               }
               case 6:
               {
                   ll.removeLast();
                   System.out.println("REMOVED LAST ELEMENT");
                   break;
               }
               case 7:
               {
                   ll.clear();
                   System.out.println("All Elements Removed");
                   break;
               }
               case 8:
               {
                   System.out.println("Enter Position:");
                   int p = sc.nextInt();
                   System.out.println("Enter Element:");
                   int y = sc.nextInt();
                   ll.set(p, y);
                   System.out.println("Element  at "+p+" by "+y);
                   break;
               }
               case 9:
               {
                   int y = ll.size();
                   System.out.println("Size of the List is: "+y);
                   break;
               }
               case 10:
               {
                   Iterator i = ll.iterator();
                   while(i.hasNext()){
                   int s = (Integer)i.next();
                   System.out.println(s);
                }
                   break;
               }
               default:
               {System.out.println("Exit");}
           }
        }
    }
}

package collectioninterface;

import java.util.HashSet;
import java.util.Scanner;

public class CollectionInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        HashSet<String> hs = new HashSet<String>();
        while(ch != 7){
            System.out.println("ENTER YOUR CHOICE/n"+ "1)ADD, 2)REMOVE, 3)CLEAR, 4)CONTAINS, 5)isEMPTY, 6)SIZE 7)EXIT");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                {
                String t = sc.next();
                boolean y = hs.add(t);
                if(y == true){System.out.println("ADDED");}
                else{System.out.println("NOT ADDED");}
                break;
                }
                case 2:
                {
                String t = sc.next();
                boolean y = hs.remove(t);
                if(y == true){System.out.println("REMOVED");}
                else{System.out.println("NOT REMOVED");}
                break;
                }
                case 3:
                {
                hs.clear();
                break;
                }
                case 4:
                {
                String t = sc.next();
                boolean y = hs.contains(t);
                if(y == true){System.out.println("FOUND");}
                else{System.out.println("NOT FOUND");}
                break;
                }
                case 5:
                {
                boolean y = hs.isEmpty();
                if(y == true){System.out.println("EMPTY");}
                else{System.out.println("NOT EMPTY");}
                break;
                }
                case 6:
                {
                int h = hs.size();
                System.out.println("SIZE OF HASHSET IS:"+h);
                break;
                }
                default:
                {
                    System.out.println("EXIT");
                }
            }
        }
    }
    
}

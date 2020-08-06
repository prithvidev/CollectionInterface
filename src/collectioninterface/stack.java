package collectioninterface;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


public class stack {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
        int ch = 0;
        Stack<Integer> hs = new Stack<Integer>();
        while(ch != 7){
            System.out.println("ENTER YOUR CHOICE"+ "1)PUSH, 2)POP, 3)PEEK, 4)SEARCH, 5)EMPTY, 6)DISPLAY 7)EXIT");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                {
                int t = sc.nextInt();
                hs.add(t);
                System.out.println("ADDED");
                break;
                }
                case 2:
                {
                int y =hs.pop();
                System.out.println("REMOVED: "+y);
                break;
                }
                case 3:
                {
                    System.out.println("PEEK ELEMENT IS: "+hs.peek());
                break;
                }
                case 4:
                {
                int t = sc.nextInt();
                int y = hs.search(t);
                if(y == -1){
                    System.out.println("NOT FOUND");
                }
                else{
                System.out.println("FOUND AT: "+y);
                }
                break;
                }
                case 5:
                {
                boolean y = hs.empty();
                if(y == true){System.out.println("EMPTY");}
                else{System.out.println("NOT EMPTY");}
                break;
                }
                case 6:
                {
                Iterator it = hs.iterator();
                while(it.hasNext()){
                    int s = (Integer)it.next();
                    System.out.println(s);
                }
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

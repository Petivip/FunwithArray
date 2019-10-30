import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
// create an array list
        ArrayList al = new ArrayList();
        Scanner key=new Scanner(System.in);

// add elements to the array list
        al.add("Red");
        al.add("Yellow");
        al.add("Blue");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        String answer="";
        while (!answer.equalsIgnoreCase("q")) {
            System.out.println("Which color do you  want to add to the list: ");
            answer = key.next();
            al.add(answer);
        }
        System.out.println(al);
    }}

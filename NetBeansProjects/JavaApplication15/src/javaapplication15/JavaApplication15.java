
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    /**
     *
     * @param args
     * @return
     */
    public static void main(String[] args) {

    int min, max;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter a Value: ");
    int count = s.nextInt();
    min = max = count;

     while (count != 0) {
       if (count > 5 && count < 10) {
           System.out.println("True");
        }
       else {
           System.out.println("False");
       }     
        System.out.print("Enter a Value: ");
        count = s.nextInt();
    }
}   

}
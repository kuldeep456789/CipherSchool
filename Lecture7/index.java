package Lecture7;

import java.util.Scanner;

public class index {
        if (b > max) {
        max = b;
    }

    if (c > max) {
        max = c;
    }
    return max;
}
public static void main(String args[]) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.name = "Suryansh";
    s1.marks = 30;
    s2.name = "Sushant";
    s2.marks = 90;
    System.out.println(s1.is_pass());
    System.out.println(s2.is_pass());
    lec7 l=new lec7();
    System.out.println("The Max of three numbers is : " +l.findMax(2, 5, 7));
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Character : ");
    char c=sc.next().charAt(0);
    switch (c) {
        case 'a':
            System.out.println("Hi,I'm a");
            break;
        case 'b':
            System.out.println("Hi,I'm b");
            break;
        case 'c':
            System.out.println("Hi,I'm c");
            break;
        default:
            System.out.println("neither a, nor b or c");
            break;
    }

}


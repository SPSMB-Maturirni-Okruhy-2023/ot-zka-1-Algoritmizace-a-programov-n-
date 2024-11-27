package cz.spsmb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napiste 10 jmen");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        int x = list.size();
        for (int i = 0; i < x; i++) {
            System.out.println(list.get(0));
            list.remove(0);
        }
        System.out.println("List size: " + list.size());


        System.out.println("Napiste 10 jmen");
        for (int i = 0; i < 10; i++) {
            list2.add(scanner.nextLine());
        }
        int y = list2.size()-1;
        for (int i = y; i >= 0; i--) {
            System.out.println(list2.get(i));
            list2.remove(i);
        }
        System.out.println("List2 size: " + list2.size());
        System.out.println("Thank you for using this useless code <3");
    }
}

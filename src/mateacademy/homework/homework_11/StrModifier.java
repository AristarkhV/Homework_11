package mateacademy.homework.homework_11;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class StrModifier {

    private int i;
    private Integer container;
    private Scanner scanner;
    private ArrayDeque arrayDeque;

    public StrModifier() {
        i = 0;
        scanner = new Scanner(System.in);
        arrayDeque = new ArrayDeque();
        System.out.println("set the string, put . in the end:");
        while (scanner.hasNextInt()) {
            container = scanner.nextInt();
            if (i % 2 != 0) {
                arrayDeque.add(container);
            }
            i++;
        }
    }

    public void modify() {
        Iterator<Integer> iterator = arrayDeque.descendingIterator();
        while (iterator.hasNext()) {
            container = iterator.next();
            System.out.print(container.toString() + " ");
        }
    }

    public static void main(String[] args) {
        StrModifier str = new StrModifier();
        str.modify();
    }
}

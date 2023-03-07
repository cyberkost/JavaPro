package iterator_tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyList {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.fillWithRandomNumbers(10, 100);
        myList.displayEvenNumbers();
        myList.displayOddNumbers();
        myList.generateRandomString();
        System.out.println("Random string: " + myList.listChar);
        myList.displayCharacter('c');
    }

    ArrayList<Integer> listNum = new ArrayList<>();
    ArrayList<Character> listChar = new ArrayList<>();
    Random random = new Random();

    public void fillWithRandomNumbers(int size, int max) {
        for (int i = 0; i < size; i++) {
            listNum.add(random.nextInt(max));
        }
    }

    public void displayEvenNumbers() {
        Iterator<Integer> iterator = listNum.iterator();
        System.out.print("Even numbers: ");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void displayOddNumbers() {
        Iterator<Integer> iterator = listNum.iterator();
        System.out.print("Odd numbers: ");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void generateRandomString() {
        for (int i = 0; i < 5; i++) {
            char c = (char) (random.nextInt(10) + 'c');
            listChar.add(c);
        }
    }

    public void displayCharacter(char c) {
        Iterator<Character> charIterator = listChar.iterator();
        while (charIterator.hasNext()) {
            char current = charIterator.next();
            if (current == c) {
                System.out.println("Found character '" + c + "'.");
                return;
            }
        }
        System.out.println("Character '" + c + "' not found.");
    }
}



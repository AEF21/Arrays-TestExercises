package se.lexicon;






import java.util.*;

import static java.lang.System.*;


public class ArraysExercises {
    static void main(final String[] args) {

        exercise();


    }


    static void exercise1() {
        final int[] Numbers = {11, 23, 39};
        for (final int Number : Numbers) {
            out.println(Number + "");
        }

    }

    static void exercise2() {
        final String[] TravelList = {"Pass", "Ticket", "Destination", "Money", "Family"};

        final int index = indexOf(TravelList, "Ticket");
        out.println("Index position of Ticket is: " + index);
    }

    public static int indexOf(final String[] array, final String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    static void exercise3() {

        final String[] Names = {"Paris", "London", "New York", "Stockholm"};
        out.println("Original Array:" + Arrays.toString(Names));
        Arrays.sort(Names);
        out.println("sorted Array:" + Arrays.toString(Names));
    }

    static void exercise4() {
        final int[] Numbers = {1, 15, 20};

        final int[] newArray = Arrays.copyOf(Numbers, Numbers.length + 1);
        newArray[newArray.length - 1] = 1;
        out.println(Arrays.toString(newArray));
    }

    static void exercise5() {

        final String[][] locations = new String[2][2];

        locations[0][0] = "France";
        locations[0][1] = "Paris";

        locations[1][0] = "Sweden";
        locations[1][1] = "Stockholm";

        for (int i = 0; i < locations.length; i++) {
            out.println(locations[i][0] + " " + locations[i][1]);
        }


    }

    static void exercise6() {
        final int[] Numbers = {43, 5, 23, 17, 2, 14};
        final OptionalDouble ArraysResult = Arrays.stream(Numbers).average();
        out.println(ArraysResult);
    }

    static void exercise7() {
        final int[] NumbersArr = new int[10];
        final int[] numbers = {1, 2, 4, 7, 9, 12, 15, 18, 21, 30};

        out.print("Array: ");
        for (final int n : numbers) {
            out.print(n + " ");
        }

        out.print("\nOdd Array: ");
        for (final int n : numbers) {
            if (n % 2 != 0) {
                out.print(n + " ");
            }
        }
    }

    static void exercise8() {
        final int[] Numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        final int[] unique = new int[Numbers.length];
        int count = 0;

        for (int i = 0; i < Numbers.length; i++) {
            boolean exists = false;

            for (int j = 0; j < count; j++) {
                if (Numbers[i] == unique[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                unique[count] = Numbers[i];
                count++;
            }
        }
        out.println("Unique Array:");
        for (int i = 0; i < count; i++) {
            out.println(unique[i] + "");
        }
    }

    static void exercise9() {
        final int[] Numbers = {1, 2, 3, 4, 5};
        final int[] newArray = new int[Numbers.length + 1];

        // 2. Copy old elements
        arraycopy(Numbers, 0, newArray, 0, Numbers.length);
    }

    static void exercise10() {

        final int[][] base = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };

        final int rows = base[0].length;
        final int cols = base[1].length;

        final int[][] table = new int[rows][cols];

        // Fyll tabellen
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                table[r][c] = base[0][r] * base[1][c];
            }
        }

        // Skriv ut tabellen
        out.println("Multiplikationstabell:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                out.printf("%4d", table[r][c]);
            }
            out.println();
        }
    }



    /*static void while loops() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Input:");
             input=scanner.next().toLowerCase();
             if (!input.equals("quit"));
             System.out.println(input);
        }
    }*/

    static void exercise11() {
        Scanner scanner = new Scanner(System.in); // scanner for input
        int stopValue = 10; // the value user must enter to stop
        List<Integer> values = new ArrayList<>(); // dynamic list to store inputs

        System.out.println("Enter numbers. Enter 10 to stop."); // instruction

        int input; // variable for user input
        do {
            input = scanner.nextInt(); // read input
            values.add(input); // store input
        } while (input != stopValue); // repeat until stop value

        int[] array = new int[values.size()]; // create array with correct size
        for (int i = 0; i < values.size(); i++) { // loop to copy values
            array[i] = values.get(i); // copy element
        }

        System.out.println("Original array:"); // print label
        for (int n : array) { // loop through array
            System.out.print(n + " "); // print element
        }

        // reverse array in-place
        for (int i = 0; i < array.length / 2; i++) { // loop halfway
            int temp = array[i]; // store left element
            array[i] = array[array.length - 1 - i]; // move right to left
            array[array.length - 1 - i] = temp; // move temp to right
        }

        System.out.println("\nReversed array:"); // print label
        for (int n : array) { // loop through reversed array
            System.out.print(n + " "); // print element
        }
    }


    public static void exercise12() { // main method
        int[][] matrix = { // 2D array
                {1, 2, 3}, // row 1
                {2, 4, 6}, // row 2
                {3, 6, 9}  // row 3
        };

        System.out.println("Diagonal elements:"); // label

        for (int i = 0; i < matrix.length; i++) { // loop rows
            System.out.print(matrix[i][i] + " "); // print diagonal element
        }
    }

    static void exercise() {
        // main method
        Random random = new Random(); // random generator

        int[] original = new int[10]; // original array
        int[] reordered = new int[10]; // new array

        for (int i = 0; i < original.length; i++) { // fill array
            original[i] = random.nextInt(100); // random number 0–99
        }

        int left = 0; // pointer for odd numbers
        int right = reordered.length - 1; // pointer for even numbers

        for (int n : original) { // loop through original
            if (n % 2 != 0) { // check odd
                reordered[left] = n; // place odd on left
                left++; // move pointer
            } else {
                reordered[right] = n; // place even on right

                right--; // move pointer
            }
        }

        System.out.println("Original array:"); // label
        for (int n : original) { // print original
            System.out.print(n + " "); // element
        }

        System.out.println("\nReordered array (odd left, even right):"); // label
        for (int n : reordered) { // print reordered
            System.out.print(n + " "); // element
        }
    }
}


















































































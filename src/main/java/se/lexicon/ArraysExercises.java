package se.lexicon;






import javax.naming.Name;
import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.jar.Attributes;


public class ArraysExercises {
    static void main(String[]args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();




    }

    static void exercise1() {
        int [] Numbers = {11, 23, 39};
        for (int Number : Numbers){
            System.out.println(Number + "");
        }

    }

    static void exercise2() {
        String[] TravelList = {"Pass", "Ticket", "Destination","Money", "Family" };

        int index = indexOf(TravelList, "Ticket");
        System.out.println("Index position of Ticket is: " + index);
    }
    public static int indexOf(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    static void exercise3() {

        String[] Names = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("Original Array:" + Arrays.toString(Names));
        Arrays.sort(Names);
        System.out.println("sorted Array:"+ Arrays.toString(Names));
    }

    static void exercise4(){
        int[] Numbers = {1, 15, 20};

        int[] newArray = Arrays.copyOf(Numbers,Numbers.length+1);
        newArray[newArray.length-1]=1;
        System.out.println(Arrays.toString(newArray));
    }

    static void exercise5() {

        String[][] locations = new String[2][2];

        locations[0][0] = "France";
        locations[0][1] = "Paris";

        locations[1][0] = "Sweden";
        locations[1][1] = "Stockholm";

        for (int i = 0; i < locations.length; i++) {
            System.out.println(locations[i][0] + " " + locations[i][1]);
        }


    }

    static void exercise6() {
       int[] Numbers = {43, 5, 23, 17, 2, 14};
       OptionalDouble ArraysResult = java.util.Arrays.stream(Numbers).average();
       System.out.println(ArraysResult);
    }

    static void exercise7() {
        int[] NumbersArr = new int [10];
        int[] numbers = {1, 2, 4, 7, 9, 12, 15, 18, 21, 30};

                System.out.print("Array: ");
                for (int n : numbers) {
                    System.out.print(n + " ");
                }

                System.out.print("\nOdd Array: ");
                for (int n : numbers) {
                    if (n % 2 != 0) {
                        System.out.print(n + " ");
                    }
                }
            }

    static void exercise8() {
        int[] Numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int []unique = new int [Numbers.length];
        int count = 0;

        for (int i = 0; i< Numbers.length; i ++){
            boolean exists = false;

            for (int j = 0; j < count; j++){
                if(Numbers[i]== unique[j]){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                unique[count]= Numbers[i];
                count++;
            }
        }
        System.out.println("Unique Array:");
        for (int i = 0; i < count; i++){
            System.out.println(unique[i]+ "");
        }
    }

    static void exercise9() {

    }






































}

































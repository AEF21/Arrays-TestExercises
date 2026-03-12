package se.lexicon;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        exercise();
    }

    static void exercise1() {
        ArrayList<String> week = new ArrayList<>();
        week.add("Saturday");
        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        System.out.println(week);

    }

    static void exercise2() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        for (String day : days) {
            System.out.println(day);

        }
    }

    static void exercise3() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add(3, "THURSDAY");
        System.out.println(days);

    }

    static void exercise4() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        java.util.List<String> firstthree = days.subList(0, 3);
        System.out.println(firstthree);


    }

    static void exercise5() {
        Set<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println(days);              // order is NOT guaranteed
    }

    static void exercise6() {
        Set<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        List<String> List = new ArrayList<>(days);
        System.out.println(List);


    }

    static void exercise7() {

        Set<String> names = new HashSet<>();
        names.add("Anna");
        names.add("John");
        names.add("Bella");
        names.add("Chris");

        List<String> list = new ArrayList<>(names);

        // manual bubble sort
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println(list);

    }

    static void exercise8() {
        Set<String> names = new TreeSet<>();
        names.add("Anna");
        names.add("John");
        names.add("Bella");
        names.add("Chris");
        System.out.println(names);


    }

    static void exercise9() {
        Map<Integer,String> Cars = new HashMap<>();
        Cars.put(1,"volvo");
        Cars.put(2,"BMW");
        Cars.put(3,"Audi");
        System.out.println(Cars);

    }

    static void exercise10() {
      Map<Integer,String>Cars = new HashMap<>();
        Cars.put(1, "Volvo");
        Cars.put(2, "BMW");
        Cars.put(3, "Audi");
        System.out.println(Cars.keySet());

    }

    static void exercise11() {
        Map<Integer,String>Cars = new HashMap<>();
        Cars.put(1, "Volvo");
        Cars.put(2, "BMW");
        Cars.put(3, "Audi");
        System.out.println(Cars.values());
    }

    static void exercise() {


    }
}
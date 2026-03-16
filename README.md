![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Array Exercises

1. Write a program which will store elements in an array of type `int` and print it out.  
   Expected output: `11 23 39` etc.

2. Create a program and create a method with name `indexOf` which will find and return the index of an element in the
   array. If the element doesn’t exist your method should return `-1` as value.  
   Expected output: `Index position of number 5 is: 2`

3. Write a program which will sort a string array.  
   Expected output:  
   String array: `[Paris, London, New York, Stockholm]`  
   Sorted string array: `[London, New York, Paris, Stockholm]`

4. Write a program which will copy the elements of one array into another array.  
   Expected output:  
   Elements from first array: `1 15 20`  
   Elements from second array: `1 15 20`

5. Create a two-dimensional string array `[2][2]`. Assign values containing any Country and City.  
   Expected output:  
   France Paris  
   Sweden Stockholm

6. Write a program which will set up an array to hold the next values in this
   order: `43, 5, 23, 17, 2, 14` and print the average of these 6 numbers.
   Expected output: `Average is: 17.3`

7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.  
   Example:  
   Array: `1 2 4 7 9 12`  
   Odd Array: `1 7 9`

8.  Write a program which will remove the duplicate elements of a given
    array `[20, 20, 40, 20, 30, 40, 50, 60, 50]`.

    Expected output:  
    Array: `20 20 40 20 30 40 50 60 50`  
    Array without duplicates: `20 40 30 50 60`

9. Write a method which will add elements in an array.
   Remember that arrays are fixed in size so you need to come up with a
   solution to “expand” the array.

10. Write a program which will represent multiplication table stored in multidimensional array.
    Hint: You have a two‑dimensional array with values:

    [[1,2,3,4,5,6,7,8,9,10],
    [1,2,3,4,5,6,7,8,9,10]]

Example output:

     1  2  3  4  5  6  7  8  9 10
     2  4  6  8 10 12 14 16 18 20
     3  6  9 12 15 18 21 24 27 30
     4  8 12 16 20 24 28 32 36 40
     5 10 15 20 25 30 35 40 45 50
     6 12 18 24 30 36 42 48 54 60
     7 14 21 28 35 42 49 56 63 70
     8 16 24 32 40 48 56 64 72 80
     9 18 27 36 45 54 63 72 81 90
    10 20 30 40 50 60 70 80 90 100

11. Write a program that ask the user for an integer and repeat that question until user give you a specific value that user already has been told about as a message in your program. Store these values in an array and print that array. After that reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, etc. Do not just reverse the order in which they are printed. You need to change the way they are stored in the array.

12. Write a program which prints the diagonal elements of a two‑dimensional array.

Example array:

    [1]  2   3
     2  [4]  6
     3   6  [9]

Diagonal elements:

    1 4 9

13. Create two arrays with arbitrary size and fill one with random numbers. Then copy over the numbers from the array
    with random numbers so that the even numbers are located in the rear (the right side) part of the array and the odd
    numbers are located in the front part (the left side).


# Collection Exercises

## Exercises

1.  Create a new list and populate it with the days of the week. Lastly,
    print out the list.

2.  Create a new list and populate it with the days of the week. Lastly,
    iterate through the list and print out each element separately.

3.  Create a new list and populate it with the days of the week
    **excluding THURSDAY**. Lastly, insert the weekday **THURSDAY** into
    the correct position in the list.

4.  Create a new list and populate it with the days of the week. Then
    create a new list out of the first three elements of the first list
    using a `subList`.

5.  Create a new `HashSet` and populate it with the days of the week.
    Lastly, print the set and pay attention to the order of the
    elements.

6.  Create a new `HashSet` and populate it with the days of the week.
    Then convert the `HashSet` to an `ArrayList`.

7.  Create a new `HashSet` and populate it with random names. Then
    convert the `HashSet` to an `ArrayList`. Lastly, manually sort the
    list in alphabetical order and print it out.

8.  Create a new `HashSet` and populate it with random names. Lastly,
    sort the names in alphabetical order using only a `Set` or a child
    of `Set`.

9.  Create a new `HashMap` of type `<Integer, String>` and populate it
    with elements containing an **id (Integer)** and a **car brand
    (String)**. Lastly, print out the entire `HashMap`.

10. Create a new `HashMap` of type `<Integer, String>` and populate it
    with elements containing an **id (Integer)** and a **car brand
    (String)**. Lastly, print out only the **keys**.

11. Create a new `HashMap` of type `<Integer, String>` and populate it
    with elements containing an **id (Integer)** and a **car brand
    (String)**. Lastly, print out only the **values**.

12. Create a new class called **Car**.

-   Add fields for `Id`, `Brand`, and `Model` with getters and setters.
-   Create a new `HashMap` of type `<Integer, Car>` and populate it with
    elements containing an **id (Integer)** and a **Car object**.
-   Lastly, print out only the **car's brand**.

------------------------------------------------------------------------

# Challenges

1.  Create an empty `Set` and populate it with all the days of the week.
    Next, create a second `Set` and populate it with **only the weekend
    days** (`SATURDAY` and `SUNDAY`). Lastly, compare the two sets and
    **retain in the first set only those days that are the same in both
    sets**.

2.  Create a new `HashMap` of type `<String, String>` and populate it
    with elements containing an **email (String)** and a **name
    (String)**. Next, create a new `Set` and populate it with the **keys
    from the HashMap**.

3.  Create a new class called **SuperHero**.

    -   Add fields for `Id`, `Name`, and `Age` with getters and setters.
    -   Have the class implement the `Comparable` interface.
    -   Implement the overridden method and have it compare the **age**
        of the superhero.
    -   Create a new `ArrayList<SuperHero>`.
    -   Sort the list by age and print out each element.

4.  Create an array of type `int` with numbers:

    ``` java
    {1,4,4,2,6,7}
    ```

    Next, create an appropriate **Collection** and populate it with the
    contents of the array. Lastly, print out each element in the
    collection **without duplicates**.

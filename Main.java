import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // 1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
        int[] number = {50, -20, 0, 30, 40, 60, 10};
        System.out.println(Arrays.toString(number));

        if (number[0] == number[number.length - 1]) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }


        // 2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
        Integer num[] = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Enter the k: ");
        int NNN = S.nextInt();
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(num));
        Arrays.sort(num, Collections.reverseOrder());
        for (int i = 0; i < NNN; i++) {
            System.out.print(num[i] + "  ");
        }

        // 3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        int count = 0;
        int sum = 0;
        int[] N = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Array: " + Arrays.toString(N));
        for (int i = 0; i < N.length; i++) {
            count = count + 1;
            sum = sum + N[i];
        }
        double avg = sum / count;
        System.out.println("AVG = " + avg);
        for (int i = 0; i < N.length; i++) {
            if (avg < N[i]) {
                System.out.println("Numbers greater than the average: " + N[i]);
            }
        }

        // 4.Write a Java program to get the larger value between first and last element of an array of integers.
        int[] Num = {20, 30, 40};
        System.out.println("Array: " + Arrays.toString(Num));
        int frist = Num[0];
        int last = Num[Num.length - 1];
        if (frist > last) {
            System.out.println("Frist number larger than last number: " + Num[0]);
        } else {
            System.out.println("Last number larger than frist number: " + Num[Num.length - 1]);
        }

        // 5.Write a Java program to swap the first and last elements of an array and create a new array.
        int[] arr = {20, 30, 40};
        int trem = 0;
        trem = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = trem;
        System.out.println(Arrays.toString(arr));


        // 6.Write a Java program to find all of the longest word in a given dictionary.
        //String [] Arr = {"cat", "dog", "red", "is", "am"};
        String[] Arr = new String[5];
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Enter String: ");
            Arr[i] = S.nextLine();
        }
        System.out.println(Arrays.toString(Arr));
        ArrayList<String> mylist = new ArrayList<>();
        int longest = 0;
        for (String str : Arr) {
            int length = str.length();
            if (length > longest) {
                longest = length;
            }
            if (length == longest) {
                mylist.add(str);
            }
        }
        System.out.println("Original dictionary : " + Arrays.toString(Arr));
        System.out.println("Longest words of this dictionary is : " + mylist);


        //7.Write a menu driven Java program with following option:
        //Accept elements of an array
        //Display elements of an array
        //Search the element within array
        //Sort the array
        //To Stop
        //the size of the array should be entered by the user.
        int size = 0;
        int[] arrayy = null;
        boolean stop = false;

        while (!stop) {
            System.out.println("Menu:");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. Stop");
            System.out.print("Enter choice: ");
            int choice = S.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter size of the array: ");
                    size = S.nextInt();
                    arrayy = new int[size];
                    System.out.println("Enter elements of the array:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        arrayy[i] = S.nextInt();
                    }
                    System.out.println("Array elements accepted.");
                    break;
                case 2:
                    if (arrayy != null) {
                        System.out.println("Array elements:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arrayy[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Array hasn't been initialized yet.");
                    }
                    break;
                case 3:
                    System.out.print("Enter element to search: ");
                    int searchElement = S.nextInt();
                    if (arrayy != null) {
                        boolean found = false;
                        for (int i = 0; i < size; i++) {
                            if (arrayy[i] == searchElement) {
                                System.out.println(searchElement + " found at index " + i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println(searchElement + " not found in the array.");
                        }
                    } else {
                        System.out.println("Array hasn't been initialized yet.");
                    }
                    break;
                case 4:
                    if (arrayy != null) {
                        Arrays.sort(arrayy);
                        System.out.println("Array has been sorted.");
                    } else {
                        System.out.println("Array hasn't been initialized yet.");
                    }
                    break;
                case 5:
                    stop = true;
                    System.out.println("stopped.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }
        S.close();


        //8. Write a program thats displays the number of occurrences of an element in the array.
        int occ = 0;
        int[] ar1 = {1, 1, 1, 3, 3, 5};
        System.out.println("Please Enter Number: ");
        int NN = S.nextInt();
        for (int i = 0; i < ar1.length; i++) {
            if (NN == ar1[i]) {
                occ = occ + 1;
            }
        }
        System.out.println(NN + " occurred " + occ + " times ");


        //9. Write a program that places the odd elements of an array before the even elements
        int[] ar = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        System.out.println("Original Array: " + Arrays.toString(ar));
        int temp = 0;
        for (int i = 0; i < ar.length && ar[i] % 2 == 0; i++) {
            for (int j = i + 1; j < ar.length && ar[i] % 2 == 0; j++) {
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        System.out.println(Arrays.toString(ar));


        //10. Write a program that test the equality of two arrays
        int[] array1 = {2, 3, 6, 9, 4};
        int[] array2 = {2, 3, 6, 9, 4};
        boolean res = Arrays.equals(array1, array2);
        if (array1.length != array2.length) {
            System.out.println("not size");
        } else if (res == true) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

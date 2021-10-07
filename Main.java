package ALGOAPP;

import java.util.Arrays;
import java.util.Scanner;

import ALGOAPP.Algos.Binary_Search;
import ALGOAPP.Algos.Linear_Search;
import ALGOAPP.Algos.Insertion_Sort;
import ALGOAPP.Algos.Merge_Sort;
import ALGOAPP.Algos.Quick_Sort;
import ALGOAPP.Algos.Radix_Sort;
import ALGOAPP.Algos.Selection_Sort;
import ALGOAPP.Algos.Shell_Sort;

public class Main {
    // public static int[] userArray;

    public static void main(String[] args) {
        // Asking for purpose
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please would you want to search or sort?");
        System.out.println(" Enter '1' to Sort");
        System.out.println("Enter '2' to Search");

        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                implementSortAlgorithm();
                break;
            case 2:
                implementSearchAlgorithm();
                break;
            default:
                System.out.println("Selected Option Out of range");
        }
    }

    private static int[] TakeInputNumbers() {
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please enter your Numbers and donot forget to separate them with commas.");
        String inputString = intScanner.nextLine();

        int InputNumbers[] = new int[inputString.split(",").length];
        for (int i = 0; i < InputNumbers.length; i++) {
            InputNumbers[i] = Integer.parseInt(inputString.split(",")[i]);
        }

        return InputNumbers;
    }

    private static void implementSearchAlgorithm() {
        Scanner searchtype_Scanner = new Scanner(System.in);
        int InputNumbers[] = TakeInputNumbers();
        // Asking the user to input a target to be searched
        System.out.println("Please enter the targeted value to be searched.");
        int target = searchtype_Scanner.nextInt();

        // Choosing Algorithms
        System.out.println("Please chooose the prefered search algorithm");
        System.out.println("Please Enter '1' to perform Linear Search");
        System.out.println("Please Enter '2' to perform Binary Search");

        int selection = searchtype_Scanner.nextInt();
        int index = -1;
        switch (selection) {
            case 1:
                index = Linear_Search.linearSearch(InputNumbers, target);
                break;
            case 2:
                index = Binary_Search.binarySearch(InputNumbers, target);
                break;
            default:
                System.out.println("Invalid option");
        }

        if (index < 0) {
            System.out.println(target + " is not in the input array.");
        } else {
            System.out.println(target + " is at index " + index);
        }

    }

    private static void implementSortAlgorithm() {
        int InputNumbers[] = TakeInputNumbers();
        // Algorithm selection
        System.out.println("Please chooose prefered algorithm");
        System.out.println("1. Insertion sort");
        System.out.println("2. Quick sort");
        System.out.println("3. Radix sort");
        System.out.println("4. Shell sort");
        System.out.println("5. Merge sort");
        System.out.println("6. Selection sort");

        Scanner sortType_Scanner = new Scanner(System.in);
        int selection = sortType_Scanner.nextInt();
        switch (selection) {
            case 1:
                Insertion_Sort.insertionSort(InputNumbers);

                break;
            case 2:
                Quick_Sort.quickSort(InputNumbers);
                break;
            case 3:
                Radix_Sort.radix_sort(InputNumbers);
                break;
            case 4:
                Shell_Sort.shellSort(InputNumbers);
                break;
            case 5:
                Merge_Sort.mergeSort(InputNumbers);
                break;
            case 6:
                Selection_Sort.selectionSort(InputNumbers);
                break;
            default:
                System.out.println("Invalid option");
        }
        System.out.println("######### RESULTS SCREEN #############");
        // 1
        // System.out.println("Your initial array: " + Arrays.toString(userArray));
        System.out.print("The sorted array is ");

        printarray(InputNumbers);
        System.out.println("");
        System.out.println("#####################################");
    }

    public static void printarray(int array[]) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}

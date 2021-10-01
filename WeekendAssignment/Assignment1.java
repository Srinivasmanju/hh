package com.company;

public class Assignment1 {
    static void printPairs(int arr[], int n)
    {

        // Nested loop for all possible pairs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" +  arr[i]+ ", "
                        + arr[j]+ ")"
                        + ", ");
            } System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=0;k<n;k++) {
                    System.out.print("(" + arr[i] + ", "
                            + arr[j] + ", "
                            + arr[k] + ")"
                            + ", ");
                }System.out.println();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=0;k<n;k++) {
                    for(int a=0;a<n;a++) {
                        System.out.print("(" + arr[i] + ", "
                                + arr[j] + ", "
                                + arr[k] + ", "
                                + arr[a]+")"
                                + ", ");
                    }System.out.println();
                }
            }
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2 ,3,4,5,6,7,8,9,10};
        int n = arr.length;

        printPairs(arr, n);

    }
}



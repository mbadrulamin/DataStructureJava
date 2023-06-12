package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {12,5,22,30,7,36,14,42,15,53,25};

        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            for (int i = 0; i < lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "  ");
        }

    }

    public static void swap(int[] array, int i, int j){

        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

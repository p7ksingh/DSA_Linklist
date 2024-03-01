package com.arr.Linked_List;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 20, 20, 30, 30, 30, 50, 40 };
        ArrayList<Integer> rm = removeConsecutiveDuplicates(arr);
        for (int i = 0; i < rm.size(); i++) {
            System.out.println(rm.get(i));

        }
    }
}

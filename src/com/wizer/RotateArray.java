package com.wizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2. Write a function that takes an array of integers and returns that array
 * rotated by N positions.For example,ifN=2,given the input array[1,2,3,4,5,6]
 * the function should return [5, 6, 1, 2, 3, 4]
 */
public class RotateArray {

    public static void rotateArray(List<Integer> arr, int N) {
        int position = arr.size() - N;
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            newArray.add(arr.get(position + i));
        }
        for (int i = 0; i < position; i++) {
            newArray.add(arr.get(i));
        }
        System.out.println(newArray);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        rotateArray(arr,2);
    }
}

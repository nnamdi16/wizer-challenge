package com.wizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3.Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to the target.You may
 * assume that each input would have exactly one solution,and you may not
 * use the same element twice.You can return the answer in any order,
 * i.e [0,1]or [1,0].
 * Example 1:Input: nums = [2,7,11,15],target = 9Output: [0,1]Output: Because nums[0] + nums[1] == 9, we return[0,1]
 * Example 2:Input: nums = [3,2,4], target = 6Output: [1,2]Example 3:Input: nums = [3,3], target = 6Output: [0,1]
 */
public class ElementIndex {
    public static void elementIndex(List<Integer> arr, int target) {
        List<Integer> targetIndex = new ArrayList<>();
        for (int i = 0; i < arr.size() -1; i++) {
            if (arr.get(i) + arr.get(i+1) == target) {
                targetIndex.addAll(Arrays.asList(i,i+1));
            }
        }

        System.out.println(targetIndex);
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,3);
        elementIndex(arr,9);
    }
}

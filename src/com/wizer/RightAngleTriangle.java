package com.wizer;

/**
 * 1.Write a Java program that takes a single parameter "height"
 * (can be hardcoded) and prints out to the console,
 * aright-aligned triangle using the'*'character.
 * The parameter should be subject to the following constraints:
 * 0 < height < 10Example: For input height = 5, the output should be:***************
 */
public class RightAngleTriangle {

    public static void rightAngleTriangle(int height) {
        int j = 1;
        while (j <= height) {
            printSpace(height-j);
            printStar(j);
            j++;
            System.out.println("");
        }
    }

    public static void printSpace(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }



    public static void main(String[] args) {
        rightAngleTriangle(5);
    }
}

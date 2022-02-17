package com.ua;

import java.util.Arrays;

public class Хэллоуин {

    private static final Integer[][] example1 = new Integer[][]{{1, 3}, {2, 2}, {3, 1}};
    private static final Integer[][] example2 = new Integer[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
    private static final Integer[][] example3 = new Integer[][]{
            {35, 14}, {57, 99}, {70, 48},
            {50, 70}, {59, 24}, {48, 72},
            {27, 48}, {50, 89}, {91, 9},
            {87, 66}, {74, 58}, {52, 29},
            {10, 19}, {11, 87}, {56, 71},
            {83, 67}, {73, 31}, {41, 58},
            {26, 39}, {100, 99}, {96, 51},
            {33, 34}, {43, 23}, {22, 41},
            {89, 28}, {43, 19}, {87, 56},
            {30, 95}, {54, 93}, {81, 98},
            {84, 26}, {51, 52}, {21, 16}};

    public static void main(String[] args) {
        Хэллоуин my = new Хэллоуин();
        System.out.println("First Test");
        my.output(example1, 4);
        System.out.println("--------------------");
        System.out.println("Second Test");
        my.output(example2, 10);
        System.out.println("--------------------");
        System.out.println("Third Test");
        my.output(example3, 270);
    }


    private void output(Integer[][] array, Integer count) {
        int sum = 0;
        sort(array);
        System.out.println("sweetnessMaxCount = " + count);
        for (int i = 0; 0 < count; i++) {
            if (count > array[i][0]) {
                count -= array[i][0];
                sum += array[i][0] * array[i][1];
            } else {
                sum += count * array[i][1];
                break;
            }
        }
        System.out.println("output = " + sum);
    }

    private void sort(Integer[][] array) {
        Arrays.sort(array, (a, b) -> Integer.compare(b[1],a[1]));
        System.out.println("sweetnessTypes = " + Arrays.deepToString(array));
    }
}

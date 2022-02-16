package com.ua;

import java.util.stream.Stream;

public class Хэллоуин {

    public static Integer summ = 0;
    private static final Integer[][] example1 = new Integer[][]{{1,3},{2,2},{3,1}};
    private static final Integer[][] example2 = new Integer[][]{{5,10},{2,5},{4,7},{3,9}};
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
        output(example1);
        output(example2);
        output(example3);
    }

    public static void output(Integer[][] array) {
        for (Integer[] anArray : array) {
            summ += Stream
                    .of(anArray)
                    .mapToInt(s -> s)
                    .reduce(1, (a, b) -> a * b);
        }
        System.out.println(summ);
    }
}

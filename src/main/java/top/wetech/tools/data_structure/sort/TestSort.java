package top.wetech.tools.data_structure.sort;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,4,3,6,66,5,444,5,332,678,321};
        System.out.println("before sort: " + Arrays.toString(arr));

        // 冒泡排序
//        System.out.println("after sort: " + Arrays.toString(BubbleSort.sort(arr)));

        // 选择排序
//        System.out.println("after sort: " + Arrays.toString(SelectSort.sort(arr)));

        // 插入排序
        System.out.println("after sort: " + Arrays.toString(InsertSort.sort(arr)));
    }
}

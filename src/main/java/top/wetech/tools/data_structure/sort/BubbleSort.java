package top.wetech.tools.data_structure.sort;

/**
 * 冒泡排序：效率问题，双层循环，每次循环的次数比上次少1，相加得到 N*(N-1)/2，即时间复杂度为O(N^2)，效率很低
 */
public class BubbleSort {
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}

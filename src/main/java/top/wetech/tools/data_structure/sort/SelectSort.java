package top.wetech.tools.data_structure.sort;

/**
 * 选择排序：与冒泡排序类似，进行了N^2次比较，但是进行了较少的交换操作，相对于交换比较占用时间的系统中，无疑选择排序会优于冒泡排序
 * java中数据交换实际不占用什么时间，底层是将指针指向了新的地址
 * 时间复杂度为O(N^2)
 */
public class SelectSort {
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

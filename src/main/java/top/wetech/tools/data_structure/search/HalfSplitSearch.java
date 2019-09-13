package top.wetech.tools.data_structure.search;

/**
 * 二分查找法：前提条件是数组是有序的
 */
public class HalfSplitSearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 6, 8, 22, 34, 35, 36, 37, 46};
//        System.out.println(half_split_search(array, 0, array.length, 4));
//        System.out.println(half_split_search(array, 0, array.length, 5));
//        int[] test = new int[0];
//        System.out.println(half_split_search(test, 0, test.length, 5));
        System.out.println(find(array, 4));
    }

    /**
     * 二分查找法 递归
     * @param array 被查询的数组
     * @param search_key 需要查询的数据
     * @return 返回该查询数据所在数组的数组下标，如果不存在，则返回-1；如果array为空，则返回-2
     */
    private static int half_split_search(int[] array, int lowerBound, int upperBound, int search_key) {
        if (array.length == 0) {
            return -2;
        }
        int middle = (lowerBound + upperBound)/2;

        if (upperBound < lowerBound) { // 报错，因为不存在这种情况；
            return -2;
        } else if (upperBound == lowerBound){
            if (search_key != array[middle]) { // 此时如果被搜索值与数组中的值不相等时，则数组中无此值；
                return -1;
            } else { // 当搜索到key时，返回数组下标
                return middle;
            }
        } else { // 当
            if (search_key > array[middle]){
                lowerBound = middle + 1;
            } else if (search_key == array[middle]){
                return middle;
            } else {
                upperBound = middle -1;
            }
        }
        return half_split_search(array, lowerBound, upperBound, search_key);
    }

    /**
     * 二分查找法 循环
     * @param array 被查找的数组
     * @param search_key 被查找的key
     * @return 返回查找到的数组下标，找不到返回-1
     * 这种方法比递归方式更优的地方在于main方法不需要知道传递的lowerBound和upperBound是什么意思，怎么传值，只需要传递有序的数组和需要查找的值就行；
     */
    private static int find(int[] array, int search_key) {
        int lowerBound = 0;
        int upperBound = array.length -1;
        int middle;
        while (true){
            middle = (lowerBound + upperBound)/2;
            if (search_key == array[middle]){
                return middle;
            } else if (lowerBound > upperBound){
                return -1; // can't find it;
            } else {
                if (search_key > array[middle]){
                    lowerBound = middle + 1;
                } else {
                    upperBound = middle - 1;
                }
            }
        }
    }

}

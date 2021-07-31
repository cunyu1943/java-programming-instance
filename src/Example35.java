import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 14:15
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example35
 * @description :
 */

public class Example35 {
    public static int SIZE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.out.println("输入第 " + (i + 1) + " 个元素");
            arr[i] = scanner.nextInt();
        }
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);

        System.out.println("输入的数组：" + Arrays.toString(arr));

//        找到最大元素和最小元素的索引位置
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] == newArr[0]) {
                minIndex = i;
            }
            if (arr[i] == newArr[SIZE - 1]) {
                maxIndex = i;
            }
        }

//        交换最大元素和第一个元素
        int tmp1 = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = tmp1;

//        交换最小元素和最后一个元素
        int tmp2 = arr[arr.length - 1];
        arr[arr.length - 1] = arr[minIndex];
        arr[minIndex] = tmp2;

        System.out.println("交换后的数组：" + Arrays.toString(arr));
    }
}

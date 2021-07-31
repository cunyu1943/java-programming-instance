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
 * @date : 2021/6/4 10:57
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example28
 * @description :
 */

public class Example28 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("输入第 " + (i + 1) + " 个数");
            arr[i] = scanner.nextInt();
        }
//        1、直接调用内置方法
//        Arrays.sort(arr);
//        System.out.println("内置方法排序后的数组：" + Arrays.toString(arr));

//        2、冒泡
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("冒泡排序后：" + Arrays.toString(arr));
    }
}

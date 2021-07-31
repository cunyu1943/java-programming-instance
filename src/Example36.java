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
 * @date : 2021/6/4 14:34
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example36
 * @description :
 */

public class Example36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入 n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("输入第 " + (i + 1) + " 个整数");
            arr[i] = scanner.nextInt();
        }

        System.out.println("输入的数组：" + Arrays.toString(arr));

        System.out.println("输入 m");
        int m = scanner.nextInt();
        int[] newArray = new int[n];

        // 定义一个新的数组，与原来的数组长度相同
        for (int i = 0; i < n; i++) {
            newArray[i] = arr[i];
        }

        // 计算新的位置
        for (int i = 0; i < n; i++) {
            int tmp = (i + m) % n;
            arr[tmp] = newArray[i];
        }

        System.out.println("位移后的数组：" + Arrays.toString(arr));
    }
}

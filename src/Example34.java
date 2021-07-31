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
 * @date : 2021/6/4 14:06
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example34
 * @description :
 */

public class Example34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入三个整数");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("输入第 " + (i + 1) + " 个整数");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("从小到大的输出顺序：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " < ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}

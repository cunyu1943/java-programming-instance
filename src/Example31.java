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
 * @date : 2021/6/4 13:51
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example31
 * @description :
 */

public class Example31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("输入第 " + (i + 1) + " 个元素！");
            arr[i] = scanner.nextInt();
        }

        System.out.println("输入的数组为：" + Arrays.toString(arr));
        System.out.println("逆序输出的数组");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }
}

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
 * @date : 2021/6/4 18:52
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example40
 * @description :
 */

public class Example40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串个数");
        int size = scanner.nextInt();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("输入第 " + (i + 1) + " 个字符串");
            arr[i] = scanner.next();
        }

        System.out.println("输入的字符为：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后的字符串数组：" + Arrays.toString(arr));
    }
}

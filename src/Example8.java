import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/2 16:25
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example8
 * @description :
 */

public class Example8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("输入次数");
        int count = scanner.nextInt();
        System.out.println("输入 a");
        int a = scanner.nextInt();

        int sum = 0;
        int i = 0;
        // 缓存尾数
        int tmp = 0;

        while (i < count) {
            tmp += a;
            sum += tmp;
            a *= 10;
            i++;
        }

        System.out.println("最终和：" + sum);
    }
}

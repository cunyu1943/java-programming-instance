import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : zhangliang
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example61
 * @createTime : 2021/9/15 16:17
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入 m");
        int m = scanner.nextInt();
        System.out.println("输入 n");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}

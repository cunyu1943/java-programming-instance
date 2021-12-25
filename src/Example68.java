import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example68
 * @createTime : 2021/12/25 17:02
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
public class Example68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        System.out.println("请输入 x");
        x = scanner.nextInt();
        if (x < 1) {
            System.out.println("y = " + x);
        } else if (x >= 1 && x < 10) {
            System.out.println("y = " + (2 * x - 1));
        } else {
            System.out.println("y = " + (x * 3 - 11));
        }
    }
}

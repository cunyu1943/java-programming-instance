import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example67
 * @createTime : 2021/12/25 16:51
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
public class Example67 {
    public static void main(String[] args) {
        int num = 15;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 n");
        n = scanner.nextInt();
        if (n % num == 0) {
            System.out.println(n + "能同时被 3 和 5 整除。");
        } else {
            System.out.println(n + "不能同时被 3 和 5 整除。");
        }
    }
}

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 13:56
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example32
 * @description :
 */

public class Example32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = scanner.nextInt();
        String str = Integer.toString(num);
        System.out.println("整数从右端开始的 4 ~ 7 位：");
        for (int i = str.length() - 4; i >= str.length() - 7; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

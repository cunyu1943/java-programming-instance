import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 23:19
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example25
 * @description :
 */

public class Example25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个 5 位数");
        int num = scanner.nextInt();
        String str = Integer.toString(num);
        if (str.charAt(0) == str.charAt(str.length() - 1) && str.charAt(1) == str.charAt(str.length() - 1 - 1)) {
            System.out.println(num + " 是一个回文数");
        } else {
            System.out.println(num + " 不是一个回文数");
        }
    }
}

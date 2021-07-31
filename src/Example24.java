import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 23:14
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example24
 * @description :
 */

public class Example24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数");
        long num = scanner.nextLong();
        String str = Long.toString(num);
        System.out.println("该数是一个 " + str.length() + " 位数！");
        System.out.print("该数逆序输出为：");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

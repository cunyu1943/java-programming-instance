import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/7 15:29
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example46
 * @description :
 */

public class Example46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str1 = scanner.nextLine();
        System.out.println("再输入一个字符串");
        String str2 = scanner.nextLine();
        System.out.println("连接后的字符串为：" + str1 + str2);
    }
}

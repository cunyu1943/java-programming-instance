import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 15:16
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example38
 * @description :
 */

public class Example38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String str = scanner.nextLine();
        System.out.println("输入字符串的长度为：" + getLength(str));
    }

    public static int getLength(String str) {
        char[] chArr = str.toCharArray();
        return chArr.length;
    }
}

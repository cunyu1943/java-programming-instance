import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example69
 * @createTime : 2021/12/25 17:07
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
public class Example69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个不多于 5 位的正整数");
        int num = scanner.nextInt();
        String numStr = Integer.toString(num);
        System.out.println("该数为：" + numStr.length() + " 位数");
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(numStr.charAt(i));
        }

        for (int i = numStr.length() - 1; i >= 0; i--) {
            System.out.println(numStr.charAt(i));
        }


    }
}

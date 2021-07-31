import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 23:26
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example26
 * @description :
 */

public class Example26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入首字母");
        char first = scanner.next().toUpperCase().charAt(0);
        char second;
        switch (first) {
            case 'M':
                System.out.println("星期一");
                break;
            case 'W':
                System.out.println("星期三");
                break;
            case 'F':
                System.out.println("星期五");
                break;
            case 'T':
                System.out.println("请输入第二个字母");
                second = scanner.next().toLowerCase().charAt(0);
                if (second == 'u') {
                    System.out.println("星期二");
                } else if (second == 'h') {
                    System.out.println("星期四");
                }
                break;
            case 'S':
                System.out.println("请输入第二个字母");
                second = scanner.next().toLowerCase().charAt(0);
                if (second == 'a') {
                    System.out.println("星期六");
                } else if (second == 'u') {
                    System.out.println("星期天");
                }
                break;
            default:
                break;
        }
    }
}

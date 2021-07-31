import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 10:08
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example15
 * @description :
 */

public class Example15 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第 1 个数");
        num1 = scanner.nextInt();
        System.out.println("输入第 2 个数");
        num2 = scanner.nextInt();
        System.out.println("输入第 3 个数");
        num3 = scanner.nextInt();

//        交换 num1、num2
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

//        交换 num1、num3
        if (num1 > num3) {
            int tmp = num1;
            num1 = num3;
            num3 = tmp;
        }

//        交换 num2、num3
        if (num2 > num3) {
            int tmp = num2;
            num2 = num3;
            num3 = tmp;
        }

        System.out.format("三个数从小到大的顺序：%d < %d < %d", num1, num2, num3);
    }
}

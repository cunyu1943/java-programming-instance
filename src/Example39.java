import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 16:03
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example39
 * @description :
 */

public class Example39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        System.out.println("对应数列的和：" + sum(num));
    }

    public static double sum(int num) {
        double result = 0;
        if (num % 2 == 0) {
            for (int i = 2; i <= num; i += 2) {
                result += 1.0 / i;
            }
        } else {
            for (int i = 1; i <= num; i += 2) {
                result += 1.0 / i;
            }
        }
        return result;
    }
}

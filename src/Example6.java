import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 22:23
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example6
 * @description :
 */

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入 m, n");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int divisor = maxCommonDivisor(m, n);
        int multiple = m * n / maxCommonDivisor(m, n);
        System.out.println("最大公约数: " + divisor);
        System.out.println("最小公倍数: " + multiple);

    }

    public static int maxCommonDivisor(int a, int b) {
        int max, min;
        max = (a > b) ? a : b;
        min = (a < b) ? a : b;

        if (max % min != 0) {
            return maxCommonDivisor(min, max % min);
        } else {
            return min;
        }
    }
}

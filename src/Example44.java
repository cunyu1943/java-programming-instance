import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/7 15:28
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example44
 * @description :
 */

public class Example44 {
    public static void main(String[] args) {
        System.out.println("输入一个偶数");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 != 0) {
            System.out.println("输入的不是偶数");
            return;
        }

        if (num == 4) {
            System.out.println("4 = 2 + 2");
            return;
        }
        function(num);
    }

    /**
     * 判断一个偶数是否能分解为两个素数
     *
     * @param num
     */
    public static void function(int num) {
        for (int i = 2; i < num / 2 + 1; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                break;
            }
        }
    }

    /**
     * 判断一个数是否为素数
     *
     * @param num
     * @return true 为素数，false 为非素数
     */
    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

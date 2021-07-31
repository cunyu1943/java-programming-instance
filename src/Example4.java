import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 14:12
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example4
 * @description :
 */

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = scanner.nextInt();
        System.out.print(num + " = ");
//        最小的质因数
        int prime = 2;
        while (prime <= num) {
//            num == prime，直接打印
            if (num == prime) {
                System.out.println(num);
                break;
//                能除尽时
            } else if (num % prime == 0) {
                System.out.print(prime + " * ");
                num = num / prime;
            } else {
//                除不尽时
                prime = prime + 1;
            }
        }
    }
}

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
 * @className : Example47
 * @description :
 */

public class Example47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 1;
        while (count <= 7) {
            do {
                System.out.println("输入一个 1 - 50 之间的整数");
                num = scanner.nextInt();
            } while (num < 1 || num > 50);
//            打印 * 号
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}

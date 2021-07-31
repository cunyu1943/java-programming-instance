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
 * @className : Example45
 * @description :
 */

public class Example45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        int tmp = num;
        int count = 0;
        for (int i = 0; tmp % 9 == 0; ) {
            tmp /= 9;
            count++;
        }
        System.out.println(num + " 能被 " + count + " 个 9 整除！");
    }
}

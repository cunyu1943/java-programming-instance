import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 13:30
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example19
 * @description :
 */

public class Example19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入需要打印的行数");
        int row = scanner.nextInt();

        if (row % 2 == 0) {
            // 计算菱形大小
            row++;
        }
        for (int i = 0; i < row / 2 + 1; i++) {
            for (int j = row / 2 + 1; j > i + 1; j--) {
                // 输出左上角位置的空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                // 输出菱形上半部边缘
                System.out.print("*");
            }
            System.out.println(); // 换行
        }
        for (int i = row / 2 + 1; i < row; i++) {
            for (int j = 0; j < i - row / 2; j++) {
                // 输出菱形左下角空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * row - 1 - 2 * i; j++) {
                // 输出菱形下半部边缘
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }
    }
}

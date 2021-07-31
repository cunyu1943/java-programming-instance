import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 13:13
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example1
 * @description :
 */

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        System.out.println("输入月份");
        month = scanner.nextInt();

        int former = 1;
        int latter = 1;
        for (int i = 1; i <= month; i++) {
//            第 1、2 个月的情况
            if (i < 3) {
                latter = 1;
            } else {
                int tmp = latter;
                latter += former;
                former = tmp;
            }
            System.out.format("第 %d 个月的兔子对数：%d\n", i, latter);
        }
    }
}

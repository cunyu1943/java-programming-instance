import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : Example71.java
 * @CreateTime : 2022/4/1 23:11
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example71 {
    public static final double R = 0.1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年数");
        int year = scanner.nextInt();
        System.out.format("%d 年后相比现在增长了：%.2f 倍\n", year, pow(1 + R, year));
    }
}

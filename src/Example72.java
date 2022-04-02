import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : Example71.java
 * @CreateTime : 2022/4/1 23:12
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example72 {
    public static final double R0 = 0.0072;
    public static final double R1 = 0.0414;
    public static final double R2 = 0.0468;
    public static final double R3 = 0.054;
    public static final double R5 = 0.0585;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        float p = scanner.nextFloat();


        System.out.format("一次存 5 年：%.2f\n", p * (1 + R5 * 5));
        System.out.format("先存 2 年，到期后本息存 3 年：%.2f\n", p * (1 + 2 * R2) * (1 + 3 * R3));
        System.out.format("先存 3 年，到期后本息存 2 年：%.2f\n", p * (1 + 2 * R2) * (1 + 3 * R3));
        System.out.format("存 1 年期，到期后本息再存，连续存 5 年：%.2f\n", p * pow(1 + R1, 5));
        System.out.format("存活期：%.2f\n", p * pow(1 + R0 / 4, 4 * 5));

    }
}

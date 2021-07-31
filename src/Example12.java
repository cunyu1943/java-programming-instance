import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/2 17:14
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example12
 * @description :
 */

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入当月利润（万）");
        int profit = scanner.nextInt();
        double bonus = 0;
        if (profit <= 10) {
            bonus = profit * 0.1;
        } else if (10 < profit && profit <= 20) {
            bonus = 10 * 0.1 + (profit - 10) * 0.075;
        } else if (20 < profit && profit <= 40) {
            bonus = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
        } else if (40 < profit && profit <= 60) {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
        } else if (60 < profit && profit <= 100) {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
        } else if (profit > 100) {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
        }

        System.out.println("利润为 " + profit + " 时的奖金为：" + bonus + " 万");
    }
}

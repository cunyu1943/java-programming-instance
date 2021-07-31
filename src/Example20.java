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
 * @className : Example20
 * @description :
 */

public class Example20 {
    public static void main(String[] args) {
        double sum = 0.0d;
        int denominator = 1;
        int numerator = 2;
        for (int i = 1; i <= 20; i++) {
            sum = sum + (double) numerator / denominator;
            int tmp = denominator;
            denominator = numerator;
            numerator = tmp + denominator;
            System.out.println("前 " + i + " 项之和：" + sum);
        }


    }
}

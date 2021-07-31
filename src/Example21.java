/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 22:48
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example21
 * @description :
 */

public class Example21 {
    public static void main(String[] args) {
        long sum = 0;
        long fac = 1;
        for (int i = 1; i <= 20; i++) {
            fac *= i;
            sum += fac;
        }

        System.out.println("1!+2!+3!+……+20！ = " + sum);
    }
}

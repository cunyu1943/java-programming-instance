/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 22:50
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example22
 * @description :
 */

public class Example22 {
    public static void main(String[] args) {
        System.out.println("5! = " + fac(5));
    }

    /**
     * 求 num 的阶乘
     *
     * @param num
     * @return num 的阶乘
     */
    public static long fac(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fac(num - 1);
        }
    }
}

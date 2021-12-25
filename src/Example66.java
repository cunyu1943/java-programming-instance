/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example66
 * @createTime : 2021/12/25 16:45
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
public class Example66 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        //sum = n * (n + 1) / 2;
        for (int i = 11; i <= n; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + ... + 100 = " + sum);


    }
}

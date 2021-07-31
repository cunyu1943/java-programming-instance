/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 9:01
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example13
 * @description :
 */

public class Example13 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int num = 0;
        System.out.println("该数可能是：");
        for (int i = 1; i <= (168 / 2); i++) {
            if (168 % i == 0) {
                int j = 168 / i;
                if (i > j && (i + j) % 2 == 0 && (i - j) % 2 == 0) {
                    m = (i + j) / 2;
                    n = (i - j) / 2;
                    num = n * n - 100;
                    System.out.print(num + "\t");
                }
            }
        }
    }
}

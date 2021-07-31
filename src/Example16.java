/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 13:03
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example16
 * @description :
 */

public class Example16 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
            }
            System.out.println();
        }
    }
}

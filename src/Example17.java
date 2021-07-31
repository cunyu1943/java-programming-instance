/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/3 13:07
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example17
 * @description :
 */

public class Example17 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i <= 10; i++) {
            sum = (sum + 1) * 2;
        }

        System.out.println("第一天的桃子数：" + sum);
    }
}

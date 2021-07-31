/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/7 15:14
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example42
 * @description :
 */

public class Example42 {
    public static void main(String[] args) {
        int num = 0;
        boolean flag = false;
        for (int i = 10; i < 100; i++) {
            if (809 * i == (800 * i + 9 * i)) {
                if (((8 * i) < 100) && ((9 * i) > 99)) {
                    flag = true;
                    num = i;
                    break;
                }
            }
        }
        System.out.println("符合的数：" + num);
    }
}

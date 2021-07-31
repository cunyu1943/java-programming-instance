/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/2 16:46
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example10
 * @description :
 */

public class Example10 {
    public static void main(String[] args) {
        double height = 100.0d;
        double sum = 100.0d;

        for (int i = 1; i < 10; i++) {
//            经过的路程等于之前路程加上当前次下落高度
            sum += height;
//            当前次下落高度为上一次的一半
            height /= 2;
        }

        System.out.println("第 10 次反弹高度：" + height / 2);
        System.out.println("10 次共经过路程：" + sum);
    }
}

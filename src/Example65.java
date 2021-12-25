import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : zhangliang
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example65
 * @createTime : 2021/9/28 15:33
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example65 {
    public static void main(String[] args) {
        int num = 0;
        Random random = new Random();
        do {
            num = random.nextInt(100);
            System.out.println("生成的随机数：" + num);
        } while (num != 50);
    }
}

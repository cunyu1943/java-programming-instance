import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : zhangliang
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example62
 * @createTime : 2021/9/28 15:08
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example62 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt());
        }

        System.out.println("生成的随机数组：" + integers);

        Collections.swap(integers, 0, 9);
        System.out.println("交换首尾元素后的数组" + integers);

        Collections.sort(integers);
        System.out.println("升序排列后的数组：" + integers);

        Collections.reverse(integers);
        System.out.println("降序排列后的数组：" + integers);
    }
}

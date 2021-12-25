import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : zhangliang
 * @version : 1.0
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example63
 * @createTime : 2021/9/28 15:25
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @description :
 */
public class Example63 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("生成的随机数组：" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("最大的元素：" + arr[2]);
        System.out.println("最小的元素：" + arr[0]);
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 11:16
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example30
 * @description :
 */

public class Example30 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 12, 23, 43, 66};
        Scanner scanner = new Scanner(System.in);

        System.out.println("给定的数组为：" + Arrays.toString(arr));
        System.out.println("输入要插入的元素");

        int value = scanner.nextInt();


        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
//        赋值到新数组，然后排序
        newArr[arr.length] = value;
        Arrays.sort(newArr);
        System.out.println("插入元素后的数组为：" + Arrays.toString(newArr));
    }
}

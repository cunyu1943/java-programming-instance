import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/7 15:29
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example48
 * @description :
 */

public class Example48 {
    public static int SIZE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个四位的整数");
        int num = scanner.nextInt();
        int[] arr = new int[SIZE];
//        千位
        arr[0] = num / 1000;
//        百位
        arr[1] = num % 1000 / 100;
//        十位
        arr[2] = num / 10 % 10;
//        个位
        arr[3] = num % 10;

//        每个数字都加上 5,然后除以 10 的余数代替
        for (int i = 0; i < SIZE; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }

//        交换 1,3 位，2,4 位
        for (int i = 0; i <= 1; i++) {
            int tmp = arr[i];
            arr[i] = arr[SIZE - 1 - i];
            arr[SIZE - 1 - i] = tmp;
        }

        System.out.println("加密后的数字");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i]);
        }
    }
}

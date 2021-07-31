import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/4 15:00
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example37
 * @description :
 */

public class Example37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入围成圈的人数");
        int num = scanner.nextInt();

        boolean[] arr = new boolean[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        int left = num;
        int counter = 0;
        int index = 0;
        while (left > 1) {
            if (arr[index] == true) {
                counter++;
                if (counter == 3) {
                    counter = 0;
                    arr[index] = false;
                    left--;
                }
            }
            index++;
            if (index == num) {
                index = 0;
            }
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] == true) {
                System.out.println("原来排在第 " + (i + 1) + " 位的人留下了！");
            }
        }
    }
}

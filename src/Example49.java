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
 * @className : Example49
 * @description :
 */

public class Example49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = scan.nextLine();
        System.out.println("输入子字符串");
        String subStr = scan.nextLine();
        int count = 0;

        if (str.equals("") || subStr.equals("")) {
            System.out.println("无输入字符串或子串，无法比较");
            System.exit(0);
        } else {
            for (int i = 0; i < str.length() - subStr.length(); i++) {
                if (subStr.equals(str.substring(i, subStr.length() + i))) {
                    count++;
                }
            }
        }

        System.out.println("子串在字符串中出现 " + count + " 次！");
    }
}

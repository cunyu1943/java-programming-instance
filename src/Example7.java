import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : cunyu
 * @version : 1.0
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io
 * @date : 2021/6/1 23:04
 * @project : Java 编程实例
 * @package : PACKAGE_NAME
 * @className : Example7
 * @description :
 */

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = scanner.nextLine();

        int character = 0;
        int digit = 0;
        int blank = 0;
        int others = 0;
//        遍历字符串，然后统计其中的字符
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                blank++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                character++;
            } else {
                others++;
            }
        }

        System.out.println("空格数：" + blank);
        System.out.println("英文字母数：" + character);
        System.out.println("数字数：" + digit);
        System.out.println("其他字符数：" + others);
    }
}

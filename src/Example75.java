import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : PACKAGE_NAME
 * @ClassName : Example75.java
 * @CreateTime : 2022/4/1 23:13
 * @Version : 1.0
 * @Author : 村雨
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade = 'A';
        System.out.println("请输入学生成绩");
        int score = scanner.nextInt();
        while (score < 0 || score > 100) {
            System.out.println("输入有误，请重新输入");
            score = scanner.nextInt();
        }
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                grade = 'E';
                break;
        }
        System.out.format("成绩为：%d，相应等级为：%c", score, grade);
    }
}

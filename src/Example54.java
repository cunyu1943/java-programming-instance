import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @Project : Java 编程实例
 * @Package : PACKAGE_NAME
 * @ClassName : Example54
 * @createTime : 2021/6/26 9:15
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example54 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入 id");
        int id = scanner.nextInt();
        System.out.println("输入姓名");
        String name = scanner.next();
        System.out.println("输入成绩");
        float score = scanner.nextFloat();

        student.setRecord(id, name, score);
        System.out.println("输入要查询考生的学号");
        id = scanner.nextInt();
        System.out.println("该考生的成绩：" + student.getRecord(id));
    }
}

class Student {
    private int id;
    private String name;
    private float score;

    public void setRecord(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public float getRecord(int id) {
        return (this.id == id) ? this.score : -1;
    }
}

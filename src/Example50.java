import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
 * @className : Example50
 * @description :
 */

public class Example50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        存放 5 个学生的信息
        String[][] info = new String[5][6];
        for (int i = 0; i < info.length; i++) {
            System.out.println("输入第 " + (i + 1) + " 个学生的学号");
            info[i][0] = scanner.next();
            System.out.println("输入第 " + (i + 1) + " 个学生的姓名");
            info[i][1] = scanner.next();
            for (int j = 0; j < 3; j++) {
                System.out.println("输入第 " + (i + 1) + " 学生的第 " + (j + 1) + " 个成绩");
                info[i][j + 2] = scanner.next();
            }
        }

//        求平均分，并存入数组
        float avg = 0.0f;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            {
                sum = 0;
                for (int j = 2; j < 5; j++) {
                    sum += Integer.parseInt(info[i][j]);
                }
                avg = (float) sum / 3;
                info[i][5] = String.valueOf(avg);
            }
        }

//        写入磁盘
        String line = null;
        File file = new File("./student.txt");
        if (file.exists()) {
            System.out.println("文件已存在");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter output = new BufferedWriter(new FileWriter(file))) {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    line = info[i][j] + "\t";
                    output.write(line);
                }
                output.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("数据已写入~");
    }
}

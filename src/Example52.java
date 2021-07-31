/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨
 * @version : 1.0
 * @Project : Java 编程实例
 * @Package : PACKAGE_NAME
 * @ClassName : Example52
 * @createTime : 2021/6/25 23:42
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io
 * @Description :
 */
public class Example52 {
    public static void main(String[] args) {
        Book book = new Book("《Java 从入门到放弃》", "村雨遥", "胡编乱造出版社");
        book.setBorrow(true);
        System.out.println(book.getName() + " 的状态是：" + book.isBorrow());
    }
}

class Book {
    private String name;
    private String author;
    private String press;
    private boolean borrow;

    public Book() {
    }

    public Book(String name, String author, String press) {
        this.name = name;
        this.author = author;
        this.press = press;
    }

    public String isBorrow() {
        return borrow ? "外借" : "在馆";
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

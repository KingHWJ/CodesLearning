package OPP;

import java.util.Arrays;

public class no_1_bass_concept {
    public static void main(String[] args) {

        // 创建对象
        Person1 ming = new Person1();
        ming.name = "小明";
        ming.age = 20;
        System.out.println(ming.name);

        Person1 hong = new Person1();
        hong.name = "小红";
        hong.age = 15;

        City hangzhou = new City();
//        hangzhou.name = "hangzhou";       针对private 修饰的变量或方法，无法直接访问
        hangzhou.setName("杭州");
//        hangzhou.setName("");
        hangzhou.setLatitude(123.12);
        hangzhou.setLongitude(34.3);

        System.out.println(hangzhou.getName()+hangzhou.getLongitude()+hangzhou.getLatitude());

        // 方法参数
        Book book = new Book();
//        book.setInfo("水浒传","施耐庵","SHZ12333",123.2);
//        book.setInfo("三国演义");    // 参数个数不对

        // 可变参数
        book.setNames("水浒传");
        book.setNames("水浒传","三国演义");
        book.setNames("水浒传","三国演义","红楼梦");
        book.setNames("水浒传","三国演义","红楼梦","西游记");
        System.out.println(Arrays.toString(book.names));

        book.setNames(null);    // 可以直接传递一个null

        // 引用传递  引用类型参数的传递，发送方和调用方指向的都是一个对象
        FullName p1 = new FullName();
        String[] name1 = {"孙悟空","猪八戒"};
        p1.setName(name1);
        System.out.println(Arrays.toString(p1.getName()));

        name1[1] = "唐僧";
        System.out.println(Arrays.toString(p1.getName()));

    }


}


// 创建类
class Person1{
    public String name;
    public int age;
}

class Book{
    public String name;
    public String author;
    public String isbn;
    public double price;

    public String[] names;

    // 方法参数
    public void setInfo(String name,String author,String isbn,double price){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public void setNameAndAuthor(String name,String author){
        this.name = name;
        this.author = author;
    }

    // 可变参数     可变参数相当于数组类型
    public void setNames(String...names){
        this.names = names;
    }
}

class City{
    private String name;        // public 破坏封装性，对类内部，需要private，可以使外部无法修改
    private Double longitude;
    private Double latitude;

    public String getName(){
        return name;
    }

    public Double getLongitude(){
        return longitude;
    }

    public Double getLatitude(){
        return latitude;
    }

    public void setName(String name){
        if(name == null || name.isBlank()){     // isBlank是空字符串
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;       // this 指向当前实例
    }

    public void setLongitude(Double num){
        this.longitude = num;
    }

    public void setLatitude(Double num){
        this.latitude = num;
    }

    // private私有方法，只能类内部自己调用
    private double calcLen(int currentLong){
        return currentLong - this.longitude;
    }
}

class FullName{

    private String[] name;

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
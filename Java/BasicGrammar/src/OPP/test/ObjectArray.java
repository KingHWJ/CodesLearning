package OPP.test;

import java.util.Arrays;
import java.util.Random;

public class ObjectArray {
    public static void main(String[] args) {
        Student[] array = new Student[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Student();
        }

        System.out.println("生成的学生信息：");
        PrintStu(array);

        // 打印出3年级的学生信息
        System.out.println("打印出3年级的学生信息");
        for (Student student : array) {
            if (student.getState() == 3) {

//                System.out.println("学号：" + student.getNumber());
//                System.out.println("年级：" + student.getState());
//                System.out.println("成绩：" + student.getScore());
                student.info();
                System.out.println("");
            }

        }

        // 使用冒泡排序按学生成绩排序，并遍历所有学生信息
        System.out.println("使用冒泡排序按学生成绩排序，并遍历所有学生信息");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getScore() < array[j].getScore()) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("排序后的学生信息：");
        PrintStu(array);

    }

    public static void PrintStu(Student[] args) {
        for (Student stu : args) {
//            System.out.println("学号：" + stu.getNumber());
//            System.out.println("年级：" + stu.getState());
//            System.out.println("成绩：" + stu.getScore());
//            System.out.println("");
            stu.info();
        }
    }
}

class Student {
    private int number; // 学号
    private int state;  // 年级
    private int score;  // 成绩

    static private int i = 1;

    public Student() {
        this.number = i++;
        this.state = new Random().nextInt(6) + 1;
        this.score = new Random().nextInt(100) + 1;

    }

    public void info(){
        System.out.println("学号：" + number + ",年级：" + state + ",成绩：" + score);
    }

    public int getNumber() {
        return number;
    }

    public int getState() {
        return state;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
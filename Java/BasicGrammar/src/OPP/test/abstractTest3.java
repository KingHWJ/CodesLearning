package OPP.test;


import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class abstractTest3 {
    public static void main(String[] args) {
//        SalariedEmployee employee1 = new SalariedEmployee("hwj","10001",1995,6,5);
//        SalariedEmployee employee2 = new SalariedEmployee("zjl","10002",1995,7,5);
//
//        System.out.println(employee1);
//        System.out.println(employee2);

        PayrollSystem payrollSystem = new PayrollSystem(2);
        payrollSystem.employee_list[0] = new SalariedEmployee("张三","100001",2021,7,5,10000);
        payrollSystem.employee_list[1] = new HourlyEmployee("李四","100001",2021,7,5,500,80);
        payrollSystem.show();
    }
}


abstract class Employee{
    static Calendar calendar = Calendar.getInstance();
    static int current_month = calendar.get(Calendar.MONTH) + 1;

    private double monthlySalary;   // 月工资
    private String name;
    private String number;
    private MyDate birthday;

    public Employee(){}
    public Employee(String name ,String number,MyDate birthday){
        this();
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    abstract double earnings();

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name：" + this.getName() + "，number：" + this.getNumber() + "，birthday：" + this.getBirthday().toDateString() + "，salary：" + monthlySalary;
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(){
    }

    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}

class SalariedEmployee extends Employee {


    public SalariedEmployee(String name,String number,int year,int month,int day,double monthlySalary){
        super(name,number,new MyDate(year,month,day));
        setMonthlySalary(monthlySalary);
    }


    @Override
    double earnings() {
        return getMonthlySalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}

class HourlyEmployee extends Employee{

    private double wage;
    private int hour;

    public HourlyEmployee(String name,String number,int year,int month,int day,double wage,int hour){
        super(name,number,new MyDate(year,month,day));
        this.wage = wage;
        this.hour = hour;
        setMonthlySalary(wage * hour);
    }


    @Override
    double earnings() {

        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }

}

class PayrollSystem{
    Employee[] employee_list;

    public PayrollSystem(int n){
        System.out.println("生成" + n + "个用户");
        employee_list = new Employee[n];
    }

    public void show(){
        for (Employee employee : employee_list) {
            System.out.println(employee);
            if(employee.getBirthday().getMonth() == Employee.current_month){
                employee.setMonthlySalary(employee.getMonthlySalary() + 100);
                System.out.println("奖励工资：100 现工资" + employee.getMonthlySalary());
            }
        }
    }
}
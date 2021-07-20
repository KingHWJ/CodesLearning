package Project.P3_Employee_Schedule_software.service;

import Project.P3_Employee_Schedule_software.domain.*;
import org.junit.Test;
import static Project.P3_Employee_Schedule_software.service.Data.*;

/*

功能：负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
说明：
employees用来保存公司所有员工对象
NameListService()构造器：
根据项目提供的Data类构建相应大小的employees数组
再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
将对象存于数组中
Data类位于com.atguigu.team.service包中

 */
public class NameListService {

    Employee[] employees;

    public NameListService(){

        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < EMPLOYEES.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);        // 职员类型
            int id = Integer.parseInt(EMPLOYEES[i][1]);          // id
            String name = EMPLOYEES[i][2];                       // 姓名
            int age = Integer.parseInt(EMPLOYEES[i][3]);         // 年龄
            double salary = Double.parseDouble(EMPLOYEES[i][4]); // 工资

            if(type == EMPLOYEE){
                employees[i] = new Employee(id,name,age,salary);
            }else if(type == ARCHITECT){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                int stock = Integer.parseInt(EMPLOYEES[i][6]);
                Equipment equipment = getEquipment(i);
                employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
            }else if(type == DESIGNER){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                Equipment equipment = getEquipment(i);
                employees[i] = new Designer(id,name,age,salary,equipment,bonus);
            }else if(type == PROGRAMMER){
                Equipment equipment = getEquipment(i);
                employees[i] = new Programmer(id,name,age,salary,equipment);
            }
        }
    }

    /**
     * 根据职员获取对应的设备
     * @param id 数组索引
     * @return 设备对象
     */
    public Equipment getEquipment(int id){
        if (id == 0) {
            return null;
        }
        int type =Integer.parseInt(EQUIPMENTS[id][0]);
        if(type == PC){
            String model = EQUIPMENTS[id][1];
            String display = EQUIPMENTS[id][2];
            return new PC(model,display);
        }else if(type == NOTEBOOK){
            String model = EQUIPMENTS[id][1];
            double price = Double.parseDouble(EQUIPMENTS[id][2]);
            return new NoteBook(model,price);
        }else if(type == PRINTER){
            String name = EQUIPMENTS[id][1];
            String types = EQUIPMENTS[id][2];
            return new Printer(name,types);
        }
        return null;
    }

    /** 获取全部职员列表信息
     * @return
     */
    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("没有找到该员工");
    }





    @Test
    public void test() throws TeamException {
//        getEquipment(0);
        new NameListService().getEmployee(100);
    }




}


package OPP;

// 多态
public class no_7_polymorphism {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Students();
        Person c = new Graduate();
//        method(a);
//        method(b);
        method(c);
    }

    public static void method(Person e){
        if (e instanceof Graduate){
            System.out.println(e.getInfo());
            System.out.println("a graduated student");
        }
        else if (e instanceof Students){
            System.out.println(e.getInfo());
            System.out.println("a student");
        }
        else{
            System.out.println(e.getInfo());
            System.out.println("a person");
        }

    }
}


class Person{
    protected String name ="Person";
    protected int age = 50;
    public String getInfo(){
        return "Name："+name + "\n"+"age:"+age;
    }
}

class Students extends Person{
    protected String school = "pku";
    public String getInfo(){
        return "Name："+name + "\n"+"age:"+age + "\nschool:" + school;
    }
}

class Graduate extends Students{
    public String major = "IT";
    public String getInfo(){
        return "Name："+name + "\n"+"age:"+age + "\nschool:" + school + "\nmajor:" +major;
    }
}
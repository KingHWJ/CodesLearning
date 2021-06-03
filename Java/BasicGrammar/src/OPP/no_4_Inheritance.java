package OPP;

//  继承
public class no_4_Inheritance {
    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "杭";
        System.out.println(u1.name);
        System.out.println(u1.age);

    }

}

class User extends People{

}

class People{
    String name;
    int age;
    boolean isMale;


}


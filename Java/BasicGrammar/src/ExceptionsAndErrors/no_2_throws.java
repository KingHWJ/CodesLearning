package ExceptionsAndErrors;

public class no_2_throws {

}

class superClass{

    public void method() throws RuntimeException{
        System.out.println("父类，可能会出错");
    }

}

class subClass extends superClass{

    @Override
    public void method() throws RuntimeException{
        System.out.println("子类");
    }
}
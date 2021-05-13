package ProcessControl;

// switch语法
public class SwitchTest {
    public static void main(String[] args) {
        int option = 111;
        switch (option) {
            case 1:
                System.out.println("select 1");
                break;
            case 2:
                System.out.println("select 2");
                break;
            case 3:
                System.out.println("select 3");
                break;
            default:
                System.out.println("选错了");
                break;
        }

        String fruit = "mongo";
        switch (fruit){
            case "apple" -> System.out.println("select apple");
            case "pear" -> System.out.println("select pear");
            case "mongo","test" -> {
                System.out.println("select mango");
                System.out.println("good choice");
            }
            default -> System.out.println("no fruit select");
        }

        String fruit1 = "mongo";
        int num = switch (fruit1){
            case "apple" -> 1;
            case "pear" -> 2;
            case "mongo","test" -> {
                System.out.println("select mango");
                System.out.println("good choice");
                yield 3;
            }
            default -> 0;
        };
        System.out.println(num);
    }


}

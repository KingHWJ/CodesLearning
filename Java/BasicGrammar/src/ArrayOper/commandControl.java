package ArrayOper;

// 命令行控制
public class commandControl {
    public static void main(String[] args) {

        for (String arg : args) {
            if(arg.equals("--version")){
                System.out.println("v 1.0");
                break;
            }
        }
    }
}

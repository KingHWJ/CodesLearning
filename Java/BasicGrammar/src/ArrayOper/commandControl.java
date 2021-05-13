package ArrayOper;

// 命令行控制
public class commandControl {
    public static void main(String[] args) {

        int[] array1;

        array1 = new int[]{1,2,3,4,5};
        System.out.println(array1);     // [I@f6f4d33
        array1 = new int[]{9,8,1};
        System.out.println(array1);     // [I@23fc625e

        for (String arg : args) {
            if(arg.equals("--version")){
                System.out.println("v 1.0");
                break;
            }
        }
    }
}

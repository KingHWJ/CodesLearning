package ExceptionsAndErrors;

// 用户自定义异常类
public class no_3_user_define_exception {
    public static void main(String[] args)  {

        no_3_user_define_exception def = new no_3_user_define_exception();

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println(def.ecm(num1, num2));
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }catch (EcDefException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }

    public double ecm(int num1, int num2) throws EcDefException {
        if(num1 < 0 || num2 < 0 ){
            throw new EcDefException("分子或分母为负数了");
        }
        return num1 / num2;
    }
}


class EcDefException extends Exception {

    static final long serialVersionUID = -3387516912324229948L;     // 提供ID 唯一标识该异常

    public EcDefException() {
    }

    public EcDefException(String msg) {
        super(msg);
    }
}
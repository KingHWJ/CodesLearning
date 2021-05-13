package ProcessControl;

// 判断引用类型是否相等
public class quoteEquals {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        if(i1 == i2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        String s1 = "hang";
        String s2 = "HANG".toLowerCase();
        System.out.println(s1);     // hang
        System.out.println(s2);     // hang

        // different quote
        if(s1 == s2){
            System.out.println("same quote");
        }else{
            System.out.println("different quote");
        }

        // same word
        if(s1.equals(s2)){
            System.out.println("same word");
        }else{
            System.out.println("different word");
        }
    }
}

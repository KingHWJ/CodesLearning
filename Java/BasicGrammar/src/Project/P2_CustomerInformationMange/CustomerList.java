package Project.P2_CustomerInformationMange;

// 客户列表类
public class CustomerList {

    private Customer[] custArray;
    private int count;  // 计数器

    public CustomerList(int num) {
        custArray = new Customer[num];
    }

    /**
     * @description: 添加客户
     * @return true：表示数组已满，false：表示数组未满
     */
    public boolean add(Customer cust) {
        if(isFull()){
            return false;
        }else{
            custArray[count++] = cust;      // 前++ 是先加后用 后++ 是先用后加
            return true;
        }
    }

    /**
     * @description: 修改客户
     * @return true：表示数组已满，false：表示数组未满
     */
    public boolean update(Customer cust){
        return false;
    }

    /**
     * @description: 删除客户
     * @return true：表示数组已满，false：表示数组未满
     */
    public boolean delete(Customer cust){
        return false;
    }

    /**
     * @description: 展示客户列表
     * @return true：表示数组已满，false：表示数组未满
     */
    public boolean showList() {
        return true;
    }

    /**
     * @description: 判断客户列表是否已满
     * @return true：表示数组已满，false：表示数组未满
     */
    public boolean isFull(){
        return count >= custArray.length;
    }

    /**
     * @description: 查找指定客户信息
     */
    public void getInfo(int index){

    }
}

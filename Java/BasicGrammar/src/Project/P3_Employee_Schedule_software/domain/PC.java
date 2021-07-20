package Project.P3_Employee_Schedule_software.domain;

public class PC implements Equipment{

    private String model;   // 型号
    private String display; // 显示器名称

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC(){
    }

    @Override
    public String toString() {
        return model + "(" + display + ")";
    }

    @Override
    public String getDescription() {
        return toString();
    }
}

package Project.P3_Employee_Schedule_software.service;

public class Status {
    private final String NAME;

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    // 构造器私有化
    private Status(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}

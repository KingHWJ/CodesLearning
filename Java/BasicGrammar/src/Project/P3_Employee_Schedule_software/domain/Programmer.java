package Project.P3_Employee_Schedule_software.domain;

import Project.P3_Employee_Schedule_software.service.Status;

public class Programmer extends Employee {
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int memberId, Equipment equipment) {
        this.memberId = memberId;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public Equipment getEquipment() {
        return equipment;
    }
    protected String getMemberDetails() {
        return getMemberId() + "/" + getDetails();
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t程序员";
    }


    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + '\t' + "程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }
}



package Project.P3_Employee_Schedule_software.service;

import Project.P3_Employee_Schedule_software.domain.Architect;
import Project.P3_Employee_Schedule_software.domain.Designer;
import Project.P3_Employee_Schedule_software.domain.Employee;
import Project.P3_Employee_Schedule_software.domain.Programmer;

import javax.xml.crypto.dsig.keyinfo.PGPData;

/**
 *
 */
public class TeamService {
    private static int counter = 1;        // 成员id 自增
    final int MAX_MEMBER = 5;               // 团队最大成员人数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;                  // 成员实际人数

    // 返回team中所有程序员构成的数组
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];

        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {

        if (total == MAX_MEMBER) {
            throw new TeamException("团队成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if (isExists(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }

        Programmer p = (Programmer) e;

        if ("BUSY".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假，无法添加");

        }

        // 先统计架构师，设计师，程序员的人数
        int numArch = 0, numDesign = 0, numProg = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numArch++;
            } else if (team[i] instanceof Designer) {
                numDesign++;
            } else if (team[i] instanceof Programmer) {
                numProg++;
            }
        }

        if (p instanceof Architect) {
            if (numArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numDesign >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numProg >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        p.setStatus(Status.BUSY);
        team[total++] = p;
        p.setMemberId(counter++);
    }

    private boolean isExists(Employee e) {
        for (int i = 0; i < total; i++) {       // 不要取总长度，取实际有的人数，这样可以保证不会出现null
            if (e.getId() == team[i].getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if(i == total){
            throw new TeamException("团队中无该成员");
        }
        // 往前移动
        for (int j = i + 1; j < total ; j++) {
            team[j-1] = team[j];
        }

        team[--total] = null;       // 原最后一个位置置为null


    }
}

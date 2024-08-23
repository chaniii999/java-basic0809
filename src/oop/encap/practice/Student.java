package oop.encap.practice;

import java.util.TreeMap;

public class Student {
    private String name;
    private String stdentId;
    private String department;

    public Student(String name, String stdentId, String department) {
        this.name = name;
        this.stdentId = stdentId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("유효하지않은 입력입니다.");
            return false;
        }
        this.name = name;
        return true;
    }

    public String getStdentId() {
        return stdentId;
    }

    public void setStdentId(String stdentId) {
        this.stdentId = stdentId;
    }

    public String getDepartment() {
        return department;
    }

    public boolean setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            System.out.println("잘못된 입력");
            return false;
        }
        this.department = department;
        return  true;
    }
}

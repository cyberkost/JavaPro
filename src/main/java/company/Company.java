package company;

//class Company имя и лист департаментов

import java.util.List;

public class Company {
    private String name;
    private List<Department> departmentList;

    public Company(String name, List<Department> departmentList) {
        this.name = name;
        this.departmentList = departmentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
}

package cn.iwakeup.Visitor.Element;

import java.util.HashMap;

/**
 * @Author Humin
 * @Date 2018/10/18 20:40
 */
public class EmployeeManagerSys {

    HashMap<String,Employee> mMap;

    public EmployeeManagerSys() {
        mMap =new HashMap<>();
    }

    public void addEle(Employee employee){
        mMap.put(employee.getName(),employee);
    }
    public void remove(String emplName){
        mMap.remove(emplName);
    }

    public void Accept(){
        for (Employee employee: mMap.values()) {

            System.out.println(employee.getName()+ "工资:"+employee.getDegree()*(100-employee.getId()));
        }

    }


}

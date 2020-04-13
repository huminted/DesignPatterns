package cn.iwakeup.Visitor;

import cn.iwakeup.Visitor.Element.Employee;
import cn.iwakeup.Visitor.Element.EmployeeManagerSys;

/**
 * @Author Humin
 * @Date 2018/10/18 20:35
 */
public class VisitorMain {

    public static void main(String a[]){

        EmployeeManagerSys employeeManagerSys=new EmployeeManagerSys();
        employeeManagerSys.addEle(new Employee(12,"户名",210));
        employeeManagerSys.addEle(new Employee(22,"胡敏",210));
        employeeManagerSys.addEle(new Employee(32,"湖蜜民",210));
        employeeManagerSys.Accept();

    }
}

package com.csi.foreach;

import java.util.LinkedList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

public class ForEachConcept {
	public static void main(String[] args) {
		List<Employee> empList = new LinkedList<Employee>();
		empList.add(new Employee(121, "SWARA", 124555));
		empList.add(new Employee(131, "SWAR", 12455));
		empList.add(new Employee(141, "SWA", 1245555));
		empList.add(new Employee(151, "SW", 12455));
		empList.add(new Employee(161, "S", 1245585));
		//System.out.println("\n" + empList);
		//empList.forEach(System.out::println);
		//empList.forEach(list->System.out.println(list));
		//for(Employee e:empList)
		//{
			//if (e.getEmpName().equalsIgnoreCase("SWARA")){
				//System.out.println(e);
			//}
		/*for(Employee e:empList){
			if(e.getEmpName().equalsIgnoreCase("s")){
				System.out.println(e);
			}
		}*/
		for(Employee e: empList){
			if(e.getEmpId()==121){
				System.out.println(e);
			}
		}
	
		}
	}



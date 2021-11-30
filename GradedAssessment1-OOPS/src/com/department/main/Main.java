package com.department.main;

import com.department.services.AdminDepartment;
import com.department.services.HRDepartment;
import com.department.services.TechDepartment;

public class Main {

	public static void main(String[] args) {
		//Admin Department
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println("Welcome to " +adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println();
		
		//HR Department
		HRDepartment hrDepartment = new HRDepartment();
		System.out.println("Welcome to " +hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println();
		
		//TechDepartment
		TechDepartment techDepartment = new TechDepartment();
		System.out.println("Welcome to " +techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		
	}

}

package com.chetan.excelextraction;

import java.io.File;
import java.util.List;

import com.poiji.bind.Poiji;

public class ExcelExtractor {

	
	/* We are using Poiji to convert the rows read from the Excel sheet.
	 * Check https://github.com/Chetan496/poiji */
	
	public static void main (String[] args ) {
		
		
		List<Employee> employees = Poiji.fromExcel(new File("E:\\ReadThisExcel.xlsx"), Employee.class);
		
		for(Employee employee : employees) {
			
			System.out.println(employee);
		}
		
	}
	
}

/**
 * 
 */
package com.utility;

import java.util.ArrayList;

import helper.Xls_Reader;

/**
 * @author laxman_p
 *
 */
public class Utils {
	
	static Xls_Reader reader;

	public static ArrayList<Object[]> getExcelData() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader("E:\\Users\\laxman_p\\Desktop\\motto\\LoginTestdata.xlsx");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("login"); rowNum++) {
			String uname = reader.getCellData("login", "userName", rowNum);
			String password = reader.getCellData("login", "passWord", rowNum);

			Object ob[] = { uname, password };
			myData.add(ob);
		}
		return myData;
	}

}

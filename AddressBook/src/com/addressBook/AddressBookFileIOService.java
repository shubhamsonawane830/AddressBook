package com.addressBook;

import java.util.List;

public class AddressBookFileIOService {

	public void writeData(List<Person> personList) {
		// TODO Auto-generated method stub
			StringBuffer buffer = new StringBuffer();
			personList.forEach(emp -> {
				String empDataString = emp.toString().concat("\n");
				buffer.append(empDataString);
			});
	}

}

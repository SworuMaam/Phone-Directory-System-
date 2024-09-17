package phonebook;

import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {

		PhoneBook1 newList = new PhoneBook1();
		PhoneBook3 newIO = new PhoneBook3();
		try (Scanner in = new Scanner(System.in)) {
			String fileName = "";

			String menu;
			boolean done = false;

			do {
				System.out.println();
				System.out.format("*******************");
				System.out.format("Welcome to PhoneBook ");
				System.out.format("*******************%n");
				System.out.format("(1)Add  \n(2)Delete \n(3)Address Search \n(4)Print List  \n(5)Search \n(6)Create file \n(7)Quit%n");	
				System.out.format("Please Enter a command: ");
				menu = in.nextLine().toUpperCase();

				switch (menu) {
					case "1": 
						System.out.println("Add an entry");
						
						System.out.print("Enter  NAME: ");
						String name = in.nextLine();

						System.out.print("Enter an ADDRESS: ");
						String address = in.nextLine();

						System.out.print("Enter a PHONE NUMBER: ");
						String phoneNumber = in.nextLine();

						newList.add(name, address, phoneNumber); 
						System.out.print("Record inserted successfully!");
						break;
					case "2": 
						System.out.print("Enter index number to delete: ");
						int delete = in.nextInt();
						newList.delete(delete);
						break;
					case "3": 
						System.out.print("Enter an address to search for: ");
						String sAddress = in.nextLine();
						newList.addressSearch(sAddress);
						break; 
					case "4": 
						System.out.println("Print Phonebook");
						newList.printList();
						break; 
			             
					case "5": 
						System.out.print("Enter a Name to search for: ");
						String sName = in.nextLine();
						newList.nameSearch(sName);
						break; 
					case "6": 
						System.out.println("Write to disk\n");
						if(fileName.equals("")){
							System.out.print("Name of file: ");
							fileName = in.nextLine();
						}else{
							System.out.print("Use existing file " + fileName + " ? (Y/N): ");
							String yn = in.nextLine();
							switch(yn.toLowerCase()){
							case "y":
								break;
							case "n":
								System.out.print("New file name: ");
								fileName = in.nextLine();
							}
						}
						newIO.writeFile(fileName, newList);
						break; 
					case "7": 
						System.out.println("Exiting!");
						done = true;
						break;
					default: 
						System.out.println("Unknown entry");
				}

			}  while (!done);
		} 
		System.out.println("Thank you!");

	}
}
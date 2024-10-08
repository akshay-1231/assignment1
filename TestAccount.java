package assignment1;

import java.util.ArrayList;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList=new ArrayList();
		arrList.add(1);
		arrList.add("akshay");
		arrList.add(32443.7776);
		
		Class Class1 = new Class(1,"ajay",34433.6565);
		Class Class2 = new Class(2,"akshay",34433.6565);
		Class Class3 = new Class(3,"ram",34433.6565);
		Class Class4= new Class(4,"jayesh",34433.6565);
		Class Class5 = new Class(5,"jay",34433.6565);
		Class Class6 = new Class(6,"aj",34433.6565);
		
		
		arrList.add(Class1);
		arrList.add(Class2);
		arrList.add(Class3);
		arrList.add(Class4);
		arrList.add(Class5);
		arrList.add(Class6);
		
		 //to display
		 for(int i=0;i<arrList.size();i++) {
			 System.out.println(arrList.get(i));
			 System.out.println("=====================");
		 }
		 
		
		
	}

}


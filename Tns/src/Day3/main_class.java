package Day3;

import java.util.Scanner;// ctrl+shift+o

public class main_class {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		   String name;
		   System.out.println("enter person name:");
		   name =ob.next();
		   System.out.println("Enter age:");
		   int age=ob.nextInt();
		   System.out.println("Enter gender:");
		   String  gender=ob.next();
		   System.out.println("Enter income:");
		   int income=ob.nextInt();
		   //person obj and ini value using setter
		   person person =new person();
		   person.setName(name);
		   person.setAge(age);
		   person.setGender(gender);
		   person.setIncome(income);
		   System.out.println(person);
		   
		   //
//		   taxCalcu calc=new taxCalcu() ;
//		   calc.calculateTax
		   }

	}


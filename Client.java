package froo;
import java.util.ArrayList;
import java.util.Scanner;
public class Client  {
	


	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		// TODO Auto-generated method stub
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Student management System");
		while(b) {
			System.out.println("\n 1.Add Student "+
								"\n 2.show all students"+
								"\n 3.get the student based on rollno"+
								"\n 4.delete Student"+
								"\n 5.update Student "+
								"\n 6.Exit" );
			System.out.println("enter the choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("you enter the addstudent ");
				System.out.println("Enter Student name");
				String name=sc.next();
				System.out.println("Enter the Student clgname ");
				String clgname=sc.next();
				System.out.println("Enter the Student rollnum ");
				int  rollnum=sc.nextInt();
				System.out.println("Enter the Student percentage ");
				double percentage=sc.nextDouble();
				System.out.println("Enter the Student city ");
				String city=sc.next();
				Student student=new Student(rollnum,name,clgname,city,percentage);
				
				   list.add(student);
				
				break;
			case 2:
				System.out.println("show the details ");
				for(int i=0;i<list.size();i++) {
					System.out.println("The Student roolno:"+list.get(i).getRollnum());
					System.out.println("The Student Name:"+list.get(i).getName());
					System.out.println("The Student collegename:"+list.get(i).getClgname());
					System.out.println("The Student city:"+list.get(i).getCity());
					System.out.println("The Student roolno:"+list.get(i).getPercentage());
					System.out.println("------------------------------------------------");
				}
				break;
			case 3:
				System.out.println("you press the student based on rollno,so enter the rollnumber ");
				int r=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getRollnum()==r) {
						System.out.println("The Student roolno:"+list.get(i).getRollnum());
						System.out.println("The Student Name:"+list.get(i).getName());
						System.out.println("The Student collegename:"+list.get(i).getClgname());
						System.out.println("The Student city:"+list.get(i).getCity());
						System.out.println("The Student roolno:"+list.get(i).getPercentage());
						System.out.println("------------------------------------------------");
						
					}
				}
				break;
			case 4:
				System.out.println("delete the student ,so eneter the rollno ");
				int k=sc.nextInt();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getRollnum()==k) {
						list.remove(i);
					}
				}
				break;
			case 5:
				System.out.println("you press update Student, so enter the 1.name of the student\n2.roll no of the Student\n3.clg of the Student\n4. name of city\n 5.percentafe of the Student ");
			    int c=sc.nextInt(); 
			    System.out.println("enter the current rollno of the Student");
			    int roll=sc.nextInt();
				switch(c) {
				case 1:
					System.out.println("enter the name which you want to update");
					String updateName=sc.next();
					for(int i=0;i<list.size();i++) {
						if(list.get(i).getRollnum()==roll) {
							list.get(i).setName(updateName);
						}
					}
					break;
					
				case 2:
					System.out.println("enter the Rollnumber which you want to update");
					int updaterollnum=sc.nextInt();
					for(int i=0;i<list.size();i++) {
						if(list.get(i).getRollnum()==roll) {
							list.get(i).setRollnum(updaterollnum);
						}
					}
					break;
				case 3:
					System.out.println("enter the clg which you want to update");
					String updateclg=sc.next();
					for(int i=0;i<list.size();i++) {
						if(list.get(i).getRollnum()==roll) {
							list.get(i).setClgname(updateclg);
						}
					}
					break;
				case 4:
					System.out.println("enter the City which you want to update");
					String updateCity=sc.next();
					for(int i=0;i<list.size();i++) {
						if(list.get(i).getRollnum()==roll) {
							list.get(i).setCity(updateCity);
						}
					}
					break;
				case 5:
					System.out.println("enter the percentage which you want to update");
					double updatepercentage=sc.nextDouble();
					for(int i=0;i<list.size();i++) {
						if(list.get(i).getRollnum()==roll) {
							list.get(i).setPercentage(updatepercentage);
						}
					}
					break;
					
					
				}
				break;
			case 6:
				System.out.println("thank you see you next time ");
				b=false;
				break;
				default:
				  System.out.println("enter the valid number");
			}
		}

	}

}

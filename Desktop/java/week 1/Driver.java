public class Driver{
public static void main(String[] args){
Date d1 = new Date(1,1,1);
Date d2 = new Date(2,2,2004);

System.out.println(d1);
System.out.println(d2);

if(d2.equals(d1))
System.out.println("yes");
else
System.out.println("dates are not equal");


Date dob = new Date(1,1,2000);
Student std1 = new Student("student1" , "001" , dob);

Student std2 = new Student("student1" , "001" , dob);
System.out.println(std1);
System.out.println(std2);


if(std1.equals(std2))
System.out.println("equal");
else
System.out.println("not equal");



}
}


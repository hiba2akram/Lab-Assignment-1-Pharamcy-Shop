import java.util.Scanner;
class Driver{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter name");
String name = sc.nextLine();
System.out.println("enter contact no:");
int contactNo = sc.nextInt();

Person p1 = new Person(name,contactNo);
p1.displayInformation();


Address a1 = new Address("one", "fyre", "3212");
a1.displayAddress();



}
}
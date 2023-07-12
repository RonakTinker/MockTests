package in.ineuron.Problems;

class Person{
	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
public class Problem3 {

	public static void main(String[] args) {
		Person person=new Person();
		
		person.setName("nitin");
		person.setAge(29);
		person.setAddress("bengaluru");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());

	}

}

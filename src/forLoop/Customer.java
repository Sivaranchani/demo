package forLoop;

public class Customer {
	  char id;
	String name;
	String email;
	long phone;	
	public Customer(char i, String n,String e,long num) {
	this.id = i;
	this.name=n;
	this.email=e;
	this.phone=num;
	}
	void display(){
		System.out.println(id+"_"+name+"_"+email+"_"+phone);
		}
	
	
	String add () {
		//int a= 1;
		//int b= 2;
		//int c = a+b;
		String d ="HI";
		return d;
		
		
	}
	public static void main(String[] args) {
		Customer c1= new Customer('A',"Siva","sivaranchanisiva@yahoo.com",9047030151l);
		Customer c2= new Customer ('B',"Ranchani","sivaranchanist@gmail.com",9159864364l);
		c1.display();
		c2.display();
		System.out.println(c1.add());
		
	}

	}


	
		
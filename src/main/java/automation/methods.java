package automation;

public class methods{

public static void main (String[] args) {
	
	methods voc = new methods();
	
	voc.abc();
	
	
	String sho = voc.anari();//this is mad for return string of method anari
	
	System.out.println(sho);
	
	koala();
	
}
//**************************************************

public void abc() {
	System.out.println("I want to become automation tester");
}

public String anari() {       //return type is there
	return "zoobie doobie";
}

public static void koala()
{
	
System.out.println("this refers to main class and we don't have to create obj for this");
}

}

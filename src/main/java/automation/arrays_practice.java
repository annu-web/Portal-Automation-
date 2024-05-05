package automation;

import java.util.ArrayList;

public class arrays_practice {
	
	public static void main (String args[]) {
		int[] abc = {1,2,3,4,5};
		
		System.out.println(abc[0]);
		
		int[] xyz= new int[5];
		
		xyz[0]=3;
		xyz[1]=76;
		xyz[2]=8;
		xyz[3]=2;
		xyz[4]=6;
		
		System.out.println(xyz[0]);
		
		//Array list is dynamic ,here we can add data according to our need
		
		ArrayList<String> ant = new ArrayList<String>();
		
		ant.add("Annu");
		ant.add("tiwari");
		ant.add("pagal");
		ant.add("ladki");
		
		for (int i=0;i<ant.size();i++)
		{
			System.out.println(ant);
		}
		
		System.out.println("*******");
		System.out.println(ant);
		
		System.out.println(ant.get(3));
		
		
		//string practice //string literal
		
		String voc = "maira is a good girl";
		
		String[] vk = voc.split("good");
		
		System.out.println(vk[1]);
		
		//string new memory allocator
		
		String k = new String("terna is a huge river");
		System.out.println(k.length());
		
		
		String[] astring = {"maya","chaya","kiraya","bakaya","okaya","shinaya"};//string array
		
		
		System.out.println(astring[0]);
	}

}

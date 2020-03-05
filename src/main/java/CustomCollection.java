import java.util.*;
import java.io.*;


interface AbstractList{
	List<String> list = new ArrayList<String>() {{
		add("1");
		add("2");
		add("3");
		add("4");
		add("5");
		add("6");
		add("7");
		add("8");
		add("9");
		add("10");
	}};
}


public class CustomCollection implements AbstractList{

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int option;
		do
		{
			System.out.println("Enter 1 to print the elements in the list :");
			System.out.println("Enter 2 to add the element in the list :");
			System.out.println("Enter 3 to remove the element in the list :");
			System.out.println("Enter 4 to fetching the element in the list :");
			System.out.println("Enter 0 to exit :");
			System.out.println("Enter your choice :");
			option=Integer.parseInt(br.readLine());
			switch(option)
			{
				case 1:	System.out.println("The list have :");
						printList(list);
						break;
				case 2:	System.out.println("Enter the element to add :");
						String element = br.readLine();
						System.out.println("Enter the index at which you want to add :");
						option=Integer.parseInt(br.readLine());
						list.add(option,element);
						break;
				case 3:	System.out.println("Enter the index to remove the element :");
						option=Integer.parseInt(br.readLine());
						System.out.println("The list element : "+list.remove(option)+" has been removed");
						break;
				case 4:	System.out.println("Enter the index to fetch element :");
						option = Integer.parseInt(br.readLine());
						System.out.println("The element at index : "+option+" is : "+list.get(option));
						break;
				default: System.out.println("Wrong Choice! Try Again :)");
			}
		}while(option!=0);
	}
		static void printList(List<String> list)
		{
			for(String s1:list)
			{
				System.out.println(s1 + " ");
			}
		}
}

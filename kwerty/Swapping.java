package kwerty;

public class Swapping {
	public static void main(String[] args) {
		int num1=10,num2=20;
		
		System.out.println("---Before Swapping---");
		System.out.println("num1 is :"+num1);
		System.out.println("num2 is :"+num2);

		int temp=num1;
			num1=num2;
			num2=temp;
		
		System.out.println("---After Swapping---");
		System.out.println("num1 is :"+num1);
		System.out.println("num2 is :"+num2);

}	
}
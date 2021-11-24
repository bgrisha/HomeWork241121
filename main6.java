package ecomHomeWork241121;

// 14 - כתוב פונקציה שמקבלת שלושה מספרים ומחזירה את הממוצע שלהם.
// – על מנת להחזיר ערך מפונקציה השתמשו ב-return.



public class main6 {

	public static void main(String[] args) {
		System.out.println(avg(2, 6, 6));

	}

	public static double avg(int a,int b,int c) {
		
		double sum=a+b+c;
		 double avg=sum/3;
		return avg;
		
	}
}

// 15 -Class variables − Class variables also known as static variables
// are declared with the static keyword in a class,
//but outside a method, constructor or a block. 
//There would only be one copy of each class variable per class, 
//regardless of how many objects are created from it.

// Local variables are declared in methods, constructors, or blocks and 
//exits only in method, constructor, or block.

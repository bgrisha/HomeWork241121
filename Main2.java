package ecomHomeWork241121;

//7.	צור פונקציה בשם multiply 
//8 .	כדי לממש מחשבון פשוט, שמבצע פעולות של חיבור וחיסור עם שני מספרים

public class Main2 {

	public static void main(String[] args) {
		multiply(7	, 5);
		multiply(3, 6);
		multiply(5, 4);
		
		calc(7, "-", 2);
		calc(7, "+", 2);

	}
public static void multiply (int a,int b) {
	System.out.println("a*b= "+a*b);
}

public static void calc(int a, String type,int b) {
	if(type.contains("+")) {
		System.out.println("a+b= "+(a+b));
	}else {
		System.out.println("a-b= "+(a-b));
	}
}
}

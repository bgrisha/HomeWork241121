package ecomHomeWork241121;

// 10.	כתוב פונקציה שמקבלת מספר, ומדפיסה את כל המחלקים השלמים שלו. 
// (לדוגמא: המחלקים השלמים של 10 הם 1 ,2 ו-5 ,כי הוא מתחלק בהם ללא שארית)

//11.	כתוב פונקציה בשם hello שמדפיסה את המילה "hello "ואחר כך קוראת לפונקציה 
 // בשם world  שמדפיסה את המילה  "WORLD"

//12.	מתי אנחנו ניתן את אותו השם לשתי פונקציות או יותר.
// Method overloading-a class has more than one method of the same name
//and their parameters are different
public class Main4 {

	public static void main(String[] args) {
		
dividerFunction(10);

hello();
	}

	public static void dividerFunction(int n) {
		
			 for(int i = 1; i<n; i++) {
		         if(n % i == 0) {
		            System.out.println(" "+i);
		         }
		
	}
}
	public static void hello() {
		System.out.print("Hello ");
		world();
	}
	public static void world() {
		System.out.println("World");
	}
}
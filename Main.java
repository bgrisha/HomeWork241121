package ecomHomeWork241121;

//1- block of statements that has a name and can be executed
//by calling (also called invoking) 

//Methods allow us to reuse the code without retyping the code.
//2 - main

public class Main {

	public static void main(String[] args) {
// 3 .	צור פונקציה בשם "greet "שמדפיסה למסך: "!morning good"קרא לפונקציה ב main-		
		greet();
// 4 - .	צור פונקציה בשם "printNum "שמקבלת מספר (INT) ומדפיסה אותו.		
		printNum(2);
		System.out.println();
// 5 .	כעת השתמש בפונקציה שכתבת בסעיף 4( מבלי לשנות אותה) , כדי להדפיס את כל המספרים מ-1 עד 10.
		for (int i = 1; i <= 10; i++) {
			printNum(i);
		}
		

	}
 public static void greet() {
	 System.out.println("good morning!");
 }
 public static void printNum(int n) {
	 System.out.print(n+" , ");
 }
}

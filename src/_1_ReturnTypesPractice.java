/*
 * We can tell what a method returns by looking at its return type
 * The return type is always to the left of the method name
 */
public class _1_ReturnTypesPractice {
	public static void main(String[] args) {
		// GOAL: Figure out what each of these hidden methods returns
		// 1. Call each method
		
		// 2. Save the return of each method into a variable of the correct type(ex: String,int,etc)
		
		// 3. Print out each variable
		
		int thing1 = method1();
		System.out.println(thing1);
		
		double thing2 = method2();
		System.out.println(thing2);
		
		String thing3 = method3();
		System.out.println(thing3);
		
		char thing4 = method4();
		System.out.println(thing4);
		
		boolean thing5 = method5();
		System.out.println(thing5);
		
	}
	
	static int method1() {
		return HiddenTypes.unknown1;
	}
	static double method2() {
		return HiddenTypes.unknown2;
	}
	static String method3() {
		return HiddenTypes.unknown3;
	}
	static char method4() {
		return HiddenTypes.unknown4;
	}
	static boolean method5() {
		return HiddenTypes.unknown5;
	}

}

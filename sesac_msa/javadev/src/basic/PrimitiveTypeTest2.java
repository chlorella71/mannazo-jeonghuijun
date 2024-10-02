package basic;

public class PrimitiveTypeTest2 {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		
		System.out.println(Integer.parseInt("1010", 2));
		System.out.println(Integer.parseInt("12", 8));
		System.out.println(Integer.parseInt("a", 16));
		System.out.println(Integer.parseInt("z", 36));
//		System.out.println(Integer.parseInt("z", 37));
		
		
	}
}

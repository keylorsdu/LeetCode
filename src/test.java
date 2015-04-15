import java.util.*;
public class test {
	static int b;
	int c;
	char ch;
	boolean bl;
	public static void main(String[] args) {
		int i;
		test t = new test();
		t.pout();
//		System.out.println(i);
	}
	void pout(){
		System.out.println(b);
		System.out.println(bl);
		System.out.println(ch);
		int[][] len = new int [][]{{1,2,3,4},{5,6,7,8}};
		System.out.println(len.length);
		System.out.println(len);
		int[] hehe = new int []{1,5,2,1,1,6,4,2};
//		Arrays.copyOfRange(original, from, to)
		Arrays.sort(hehe);
		List<Integer> list = new ArrayList<Integer>();
//		System.out.println(list.get(3));
		System.out.println(Arrays.binarySearch(hehe, 5));
	}
}

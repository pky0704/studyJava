
package chap06;

public class Ex18 {
	
	public static void main(String[] args) {
		int x = 2;
		int n=5;
		long result = 0;
		
		for(int i=1;i<=n;i++) {//1,2,3,4,5
			result += power(x, i);//result = power(2,1) + power(2,2) + power(2,3) + power(2,4) +power(2,5)
			System.out.println("power("+x+","+i+")="+result);
		}
		
		System.out.println(result);
		
	}
	static long power(int x, int n) {//2, 5 대입
		if(n==1) return x;
		return x * power(x, n-1);
		//power(2,5) -> 2*power(2,4)
		//					-> 2*2*power(2,3)
		// 					-> 2*2*2*power(2,2)
		//					-> 2*2*2*2*power(2,1)//  n=1이니깐 return 2 반환
		//					-> 2*2*2*2*2
		
		
	}
}

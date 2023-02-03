import java.util.Scanner;

/*
 * [문제]
 * 3개의 정수를 입력받아 중간값을 출력하라.
 * 
 * [실행결과]
 * 54
 * 75
 * 32
 * 중간값 = 54
 * 
 */

public class MiddleNumber {
	
	public MiddleNumber() {
		
	}
	
	static void MiddleNumberNoApi() {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if(n1>=n2) {
			if(n1>=n3) {
				if(n2>=n3) {
					System.out.println(n2);
				}else {
					System.out.println(n3);
				}
			}else {
				System.out.println(n1);
			}
		}else {
			if(n2>=n3) {
				if(n3>=n1) {
					System.out.println(n3);
				}else {
					System.out.println(n1);
				}
			}else {
				System.out.println(n2);
			}
		}
	}
	
	static void MiddleNumberApi() {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int max1 = Integer.max(n1, n2);
		int max2 = Integer.max(max1, n3);
		int min1 = Integer.min(n1, n2);
		int min2 = Integer.min(min1,n3);
		int middle = (n1+n2+n3) - (max2+min2);
		System.out.println(middle);
	}

	static int MiddleCheck() {
		int a = scan()[0];
		int b = scan()[1];
		int c = scan()[2];
		
		if(a<b && b<c || c<b && b<a) {
			return b;
		}else if(b<a && a<c || c<a && a<b) {
			return a;
		}else if(a<c && c<b || b<c && c<a) {
			return c;
		}else {
			return -1;
		}
		
	}
	
	static int[] scan() {
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		int c = Integer.parseInt(s.nextLine());
		int[] group = {a, b, c};
		
		return group;
	}
	
	public static void main(String[] args) {
		int middle = new MiddleNumber().MiddleCheck();
		System.out.println(middle);
	}

}

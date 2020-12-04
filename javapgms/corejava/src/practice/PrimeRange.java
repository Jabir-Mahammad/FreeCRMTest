package practice;


class Prime1{
	public static void prntp(int n) {
		System.out.println("he;;;;;");
		int cnt;
		for(int i=1;i<=n;i++) {
			cnt=0;
			for(int num=i;num>=1;num--) {
				if(i%num==0)
					cnt++;
			}
			if(cnt==2)
				System.out.println(i+",");
		}
	}
}

public class PrimeRange {

	public static void main(String[] args) {
		Prime1.prntp(11);
		System.out.println("he;;;;;");

	}

}

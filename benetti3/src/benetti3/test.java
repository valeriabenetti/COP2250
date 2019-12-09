package benetti3;

public class test {
	public static void main(String[] args) {
		int b = 0, sum = 0;
		while(b < 6) {
			++b;
			if(b%2 == 0)
				continue;
			b++;
			sum = sum + b;
		}
		System.out.print(sum);
	}
}

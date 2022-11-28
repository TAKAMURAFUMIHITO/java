public class test2 {
	public static void main(String[] args) {
		int num;
		int count = 0;
		int total = 0;
		for (num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				count = count + 1;
				total = total + num;
			}
		}
		System.out.println("偶数の数は" + count + "個で、その合計は" + total + "です。");
	}
}
public class test4 {
	public static void main(String[] args) {
		int[] array = new int[20];
		for (int i = 0; i < 20; i++) {
			array[i] = 5 * i;
		}
		for (int a = 0; a < 11; a++) {
			if (array[a] % 2 != 0) {
				System.out.print(array[a] + ",");
			}
		}
		for (int b = 11; b < 18; b++) {
			if (array[b] % 2 == 0) {
				System.out.print(array[b] + ",");
			}
		}
		System.out.print(array[18]);
	}
}
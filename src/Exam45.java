
public class Exam45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		count = 20;
		Exam45 ex = new Exam45();
		ex.lab9(count);
		count = 10;
		ex.lab10(count);
	}

	private void lab10(int count) {
		for (int i = count; i > 0; i--) {
			if (i == 2)
				continue;
			System.out.println("i=" + i);
		}
	}

	private void lab9(int count) {
		for (int i = count; i > 0; i--) {
			if (i == 11) {
				System.out.println("IN if count is " + i);
				continue;
			}
			System.out.println("out IF count is " + i);

		}
	}
}

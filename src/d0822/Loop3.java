package d0822;

public class Loop3 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0) {
				continue;
			}
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
	}
}

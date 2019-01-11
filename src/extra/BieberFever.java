package extra;

public class BieberFever {
	public static void main(String args[]) {
		for (int chorus = 0; chorus < 4; chorus++) {
			for (int count = 0; count < 3; count++) {
				for (int i = 0; i < 3; i++) {
					System.out.print("baby, ");
				}
				if ((count % 2) == 0) {
					System.out.println("oh");
				} else {
					System.out.println("no");
				}

			}
			System.out.println("I thought you'd always be mine\n");
			
		}
		
	}
}

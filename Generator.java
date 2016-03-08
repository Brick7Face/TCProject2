import java.io.IOException;

public class Generator {
	public static void main(String[] args) {
		try {
			Character n = new Character();
			n.write();
		} catch (IOException e) {
			System.out.println("File not found.");
		}
	}
}


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileInputStream {

	public DemoFileInputStream() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		FileInputStream reader = new FileInputStream("./src/hello.txt");
//		FileReader reader = new FileReader("./src/hello.txt");
		int res = 0;
		while ((res = reader.read()) != -1) // -1 indicates EOF
		{
			System.out.print((char) res);
		}

		reader.close();

	}

}

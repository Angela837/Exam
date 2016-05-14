import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Answer {

	public void rightAnswer() throws IOException {
		BufferedReader in = null;
		List<String> ans = new ArrayList<String>();
		try {
			in = new BufferedReader(new FileReader("D:\\answer.txt"));

			String c;
			while ((c = in.readLine()) != null) {
				ans.add(c);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (in != null) {
				in.close();
			}

		}

	}

}

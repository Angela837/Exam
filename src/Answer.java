import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Answer {
	
	

	public List rightAnswer() throws IOException {
		BufferedReader in = null;
		List ans = new ArrayList();
		in = new BufferedReader(new FileReader("D:\\´ð°¸.txt"));

			String c;
			while ((c = in.readLine()) != null) {
				for (int j = 0; j < c.length(); j++) {
					ans.add(c.charAt(j)); 
				}

			}
			
		
		return ans;

	}

}

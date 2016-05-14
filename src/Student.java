import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
	BufferedReader in=null;
	List<String> ansStu = new ArrayList<String>();
	public void FileList() throws IOException {
		File f = new File("D:\\exam");
		File[] fList = f.listFiles();
		for (File f1 : fList) {
			in = new BufferedReader(new FileReader(f1));

			String c;
			while ((c = in.readLine()) != null) {
				ansStu.add(c);
		}
		
	}

}
}
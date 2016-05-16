import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
	int fileNum = 0;
	List<File> list = new ArrayList<File>();
	File f = new File("D:\\Exam");
	File[] fList = f.listFiles();

	// 遍历Exam文档 将其存入集合
	public void traverseFolder() {
		for (File f1 : fList) {
			list.add(f1.getAbsoluteFile());
			fileNum = fileNum + 1;
	
		}

	}
	// 学生答案集合

	public void ansStu() throws IOException {
		Answer answer=new Answer();
		
		BufferedReader in = null;
		String c = null;
		for (int i = 0; i < fileNum; i++) {
			List ansStu = new ArrayList();
			in = new BufferedReader(new FileReader(list.get(i)));
			while ((c = in.readLine()) != null) {
				for (int j = 0; j < c.length(); j++) {
					ansStu.add(c.charAt(j)); 
				}
			}
			int total=100;
			for (int j = 0; j < ansStu.size(); j++) {
				if(answer.rightAnswer().get(j)!=ansStu.get(j)){
					total-=4;
				}
			}
//			Check check=new Check();
//			check.checkAnswer();
			System.out.println(fList[i].getName()+"   "+total);

		}

	}
	public static void main(String[] args) {
		Student student=new Student();
		student.traverseFolder();
		try {
			student.ansStu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
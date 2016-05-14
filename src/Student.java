import java.io.File;

public class Student {
	public void FileList(){
	File d = new File("D:\\exam");
	File[] fl = d.listFiles();
	for (int i = 0; i < fl.length; i++) {
			File e=fl[i];
			if(e.isFile()){
				System.out.println(e.getName());
			}
		
	}}
}

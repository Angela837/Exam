import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException{
	Long begin=System.currentTimeMillis();
	BufferedInputStream in = null;
	BufferedOutputStream out = null;
	try{
		File f=new File("D:\\2.zip");
		f.createNewFile();
		in=new BufferedInputStream (new FileInputStream("D:\\1.zip"));
		out=new BufferedOutputStream (new FileOutputStream(f));
		
		int c;
		while((c=in.read())!=-1){
			out.write(c);

		}
		
	}catch(IOException e){
	}finally{
		if(in!=null){
			in.close();
		}
		if(out!=null){
			out.close();
		}
	}
	Long end=System.currentTimeMillis();
	System.out.println(end-begin);
	
}
}

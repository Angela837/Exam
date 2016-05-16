import java.io.IOException;

public class Check {
public static  void main(String[] args) throws IOException {
Check c=new Check();
c.checkAnswer();
}
public void checkAnswer() throws IOException{
	Answer a=new Answer();
	Student s=new Student();
	String Str1="";
	String Str2="";
	//Str1=a.rightAnswer();
	//Str2=s.ansStu();
	int wrongNum = 0;
	do{
		Str1.equals(Str2);
		if (!Str1.equals(Str2)){
			wrongNum++;
		}
		
	}while(Str1=="\n");
	System.out.println("·ÖÊý£º"+(4*(25-wrongNum)));
	
}
}

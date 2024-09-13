import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int time=sc.nextInt();
		boolean wd=sc.nextBoolean();
		int tp=10;
		if((age<12)||(age>60)){
		    tp=tp-2;
		}
		if((time>=18)||(time<=22)){
		    tp=tp+2;
		}
		if(wd){
		    tp=tp+2;
		}
		System.out.println(tp);
		
	}
}

import java.util.Scanner;
class fibonacciClass{
	int curr_size,max_size=100;
	long []fibo=new long[max_size];
	public int getCurrSize(){
		return curr_size;
	}
	public void generateSequence(int N){
		long a=0,b=1;
		for(int i=0;i<Math.min(max_size,N);++i){
			fibo[i]=a;
			long tmp=a;
			a=b;
			b=b+tmp;
		}
		curr_size=Math.min(max_size,N);	
	}
	public void displaySequence(){
		for(int i=0;i<curr_size;++i){
			System.out.println(fibo[i]+" ");
		}
		System.out.println();
	}
}
class lab1{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		fibonacciClass series=new fibonacciClass();
		int N=s.nextInt();
		series.generateSequence(N);
		series.displaySequence();
	}
}
import java.util.Scanner;
class Artist{
	String name;
	int AId,tmp=0;
	Artist(String name){
		tmp++;
		this.AId=tmp;
		this.name=name;
	}
}
class Customer{
	String name;
	int subscription,CId;
	Customer(String name){
		this.name=name;
	}
	
}
class labass4{
	public static void main(String []args){
		Scanner s=new Scanner (System.in);
		int q=s.nextInt();
		while(q-->0){
			int a=s.nextInt();
			if(a==1){
				String c=s.next();
				if(c.charAt(0)=='A'){
					Artist na=new Artist(s.next());
				}
				else if(c.charAt(0)=='C'){
					Customer nc=new Customer(s.next());
				}
			}
		}
	}
}

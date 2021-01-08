import java.util.*;
class database{
	String cat,sub_cat,product;
	int price,num_p;
	public void addcat(String s){
		this.sub_cat=s;
	}
}
class administrator extends database{
	ArrayList cat=new ArrayList()<String>;
	public void insert(String category,String sub_cat,String product){
		if(product.equals("/d")){
			database tmp;
			tmp.addcat();
		}
	}
}
class customer extends database{
	
}
class lab7{
	public static void main(String []args){
		Scanner s=new Scanner (System.in);
		int o=1;
		while(o==1){
			administrator ad=new administrator();
			System.out.println("Administrator");
			System.out.println("\ta. Insert product/category");
			System.out.println("\tb. Delete product/category");
			System.out.println("\tc. Search product");
			System.out.println("\td. Modify product");
			System.out.println("\te. Exit as Administrator");
			char a=s.next().charAt(0);
			if(a=='a'){
				System.out.println("Select:-");
				System.out.println("\ta. Enter category");
				System.out.println("\tb. Enter product");
				char tmp=s.next().charAt(0);
				if(tmp=='a'){
					System.out.prinln("Enter the category");
					ad.insert(s.next(),"/d","/d");
				}
			}
		}
	}
}
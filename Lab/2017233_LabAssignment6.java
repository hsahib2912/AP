import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
class board{
	int [][]a=new int[10][10];
	Random r=new Random();
	public void setBoard(){
		int n=0;
		while(n<50){
			int x=r.nextInt(9);
			int y=r.nextInt(9);
			if(a[x][y]==0){	int toy=1+r.nextInt(9);this.a[x][y]=toy;n++;}
		}
	}
	public String rItem(int x,int y){
		if (a[x][y]==1){return "dog";}
		else if(a[x][y]==2){return "cat";}
		else if(a[x][y]==3){return "rabbit";}
		else if(a[x][y]==4){return "kit-kat";}
		else if(a[x][y]==5){return "snickers";}
		else if(a[x][y]==6){return "five-star";}
		else if(a[x][y]==7){return "pen";}
		else if(a[x][y]==8){return "pencil";}
		else{return "eraser";}
	}
	public int rWeight(int x,int y){
		if (a[x][y]==1){return 50;}
		else if(a[x][y]==2){return 40;}
		else if(a[x][y]==3){return 20;}
		else if(a[x][y]==4){return 10;}
		else if(a[x][y]==5){return 5;}
		else if(a[x][y]==6){return 7;}
		else if(a[x][y]==7){return 2;}
		else if(a[x][y]==8){return 1;}
		else{return 3;}
	}
}
class lab6{
	public static void main(String []args){
		System.out.println("\tUSE ONLY LOWER CASE LETTERS: dog,cat,rabbit,kit-kat,snickers,five-star,pen,pencil,eraser");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String []Pnames=new String[n];
		for(int i=0;i<n;++i){
			Pnames[i]=s.next();
		}
		board B=new board();
		B.setBoard();int k=0;
		while(n-->0){
			double totalPoints=0;
			ArrayList<String> winList=new ArrayList<String>();
			System.out.println("--"+Pnames[k]+" started playing--");
			String []toyList=new String[5];
			for(int i=0;i<5;++i){
				toyList[i]=s.next();
			}
			for(int i=0;i<10;++i){
				System.out.println("Choose a coordinate");
				int x=s.nextInt();
				int y=s.nextInt();
				if(B.a[x][y]==0){
					System.out.println("Sorry, no prize here");
					totalPoints=totalPoints/2;
				}
				else{
					System.out.println("Guess the prize");
					int prize=s.nextInt();
					if(toyList[prize].equals(B.rItem(x,y))){
						System.out.println("You won "+toyList[prize]);
						winList.add(toyList[prize]);
						if(toyList[prize].equals("dog")||toyList[prize].equals("cat")||toyList[prize].equals("rabbit")){
							totalPoints=2*totalPoints+10;
						}
						else if(toyList[prize].equals("kit-kat")||toyList[prize].equals("snickers")||toyList[prize].equals("five-stars")){
							totalPoints=totalPoints+20;
						}
						else{
							totalPoints=totalPoints+(totalPoints/10)+5;
						}
					}
					else{
						System.out.println("Sorry, you guessed it wrong, it was "+B.rItem(x,y));
						int de;
						if(toyList[prize].equals("dog")){de=50;}
						else if(toyList[prize].equals("cat")){de=40;}
						else if(toyList[prize].equals("rabbit")){de=20;}
						else if(toyList[prize].equals("kit-kat")){de=10;}
						else if(toyList[prize].equals("snickers")){de=5;}
						else if(toyList[prize].equals("five-star")){de=7;}
						else if(toyList[prize].equals("pen")){de=2;}
						else if(toyList[prize].equals("pencil")){de=1;}
						else{de=3;}
						
						if(totalPoints-Math.abs(de-B.rWeight(x,y))>=0){
							totalPoints=totalPoints-Math.abs(de-B.rWeight(x,y));
						}
						else{
							totalPoints=0;
						
						}
					}
				}
				System.out.println(totalPoints+" Points");
			}
			System.out.println("--Summary for "+Pnames[k]+"--");
			System.out.print("You have won ");
			for(int i=0;i<winList.size();++i){
				System.out.print(winList.get(i)+" ");
			}
			System.out.print(". Total points won ="+totalPoints);
			k++;
			System.out.println();
		}
	}
}
import ch.aplu.turtle.*;

public class makeSwirlSquare{
	public static viod main(string[] args){
		makeSwirlSquare m=new makeSwirlSquare();
		m.makeSwirlSquare(5,15,20,90.0);
	}

	Turtle t1=new Turtle();

	public void makeSwirlSquare(int size,int bigger,int turns,double degree){
		int nBigger=2;
		for(int i=0;i<turns;i++){
			if(i%nBigger!=0){
				size+=bigger;
			}
			t1.forward(size);
			t1.right(degree);
		}
	}
}

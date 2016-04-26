class Area{
	int length;
	int breadth;

Area(int a){

	length=breadth=a;
	
}
	Area(int l,int b){
	length=l;
	breadth=b;
}

float calculateArea(){
	return (length*breadth);
}
}

public class assignment3{
	public static void main(String[] args){
	Area square= new Area(5);
	Area rectangle = new Area(4,5);
	System.out.println("Area of square"+ square.calculateArea());
	System.out.println("Area of rectangle"+ rectangle.calculateArea());
	}
}
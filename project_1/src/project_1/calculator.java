package project_1;

public class calculator {

private float length;
private float width;
public float area;
public float perimeter;



public void set_l_w(float length, float width) {
	this.length=length;
	this.width=width;
}
 
public float  area () {
	this.area =length*width;
	return area;		
}
public float  perimeter() {
	 this.perimeter =2*(length*width);
	return perimeter;		
}
public void getter() {
	System.out.println(this.area);
	System.out.println(this.perimeter);
	
}

 
 
//private int number;
//private int temp=0;
	// public calculator(int num) {
//	 this.number=num;
//}
//public int SumOfDigits() { 
//	
//	while(number>0) {
//		 temp += number%10;
//		 number=number/10;
//	}
//	
//	return temp;
//	
//	}

//public void showAns() {
//	System.out.println(temp);
//	}
//}
}
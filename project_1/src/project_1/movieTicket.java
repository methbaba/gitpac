package project_1;

public class movieTicket {
private int movie_id;
private int seats;
private double cost;

public void set_attributtes(int id, int seats  ) {
	this.movie_id=id;
	this.seats = seats;
	
}
 
public void totalcost() {
	
	int n= this.movie_id;
	double c= this.cost;
	int s= this.seats;
	
	switch(n) {
	case 111:
		c=Math.round(7*s*1.02);
		System.out.println(c);
		break;
	case 112:
		c=Math.round(8*s*1.02);
		System.out.println(c);
		break;
	case 113:
		c=Math.round(8.5*s*1.02);
		System.out.println(c);
		break;
	default:
		System.out.println("error invalid movie ID");
		break;
		
	}
		
}

public void get_totalcost() {
	System.out.println(
			"for movie id "+ this.movie_id+"for seats "+this.seats);
}

	
}

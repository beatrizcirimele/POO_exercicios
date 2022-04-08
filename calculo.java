public class calculo {
	
	
	private double x;
	private double y;
	
	
	public calculo(double x, double y) {
		
		
		this.x = x;	
		this.y = y;
	}




	public double getX() {
		return x;
	}




	public void setX(double x) {
		this.x = x;
	}
	


	public double getY() {
		return y;
	}




	public void setY(double y) {
		this.y = y;
	}




	public void calsoma() {
	
	x += y;
	
	
	System.out.println(x);

	}
	
	public void calsubt() {
		
	x -= y;
			
	System.out.println(x);	
			
	}


	public void calmult() {
		
	x *= y;
		
	System.out.println(x);	
		
	}

	public void caldivi() {
		
	x /= y;
			
	System.out.println(x);	
			
	}
















}

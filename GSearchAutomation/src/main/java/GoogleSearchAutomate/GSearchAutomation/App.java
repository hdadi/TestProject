package GoogleSearchAutomate.GSearchAutomation;

/**
 * Hello world!
 *
 */
public class App 
{//commenting from master github
    int c=0;
	int d=0;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
                
    }

    public void add(int a, int b){
            c=a+b;
            System.out.println("Addition of a and b is: "+c);
        }
    
    public void mult(int a, int b) {
    	d=a*b;
    	System.out.println("Multiplication of a and b is: "+d);
    }
	
	public void mult(int a, int b, int c) {
    	d=a*b*c;
    	System.out.println("Multiplication of a and b is: "+d);
    }
}

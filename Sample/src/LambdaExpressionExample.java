import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    
	
	
	Integer[] values = { 1, 3, 7 };
	List list = Arrays.asList(values);	
   System.out.println("list "+list);  
}
}
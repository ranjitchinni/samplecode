
public class SwitchOnString {

	public static void main(String[] args) {
		boolean create = false;
	      boolean verbose = false;
	      boolean debug = false;
	 
	      for (String arg: args) {
	         switch (arg) {
	            case "-c": create = true; break;
	            case "-v": verbose = true; break;
	            case "-d": debug = true; break;
	            default:
	               System.out.println("invalid option");
	               System.exit(1);
	         }
	      }
	 
	      System.out.println("create: " + create);
	      System.out.println("verbose: " + verbose);
	      System.out.println("debug: " + debug);

	}

}

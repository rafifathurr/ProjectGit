package samplegit;

import java.util.Scanner;
public class ProjectGit {
    private String output ;
    private final Scanner scanner;
    
    
    
    //String scan
    public String scan(){
        //Input
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Your Text");
        
        //Output
        output = input.nextLine();
        return output;
        
    }
    
    public static void main(String[] args) {
        //Call Method
        ProjectGit pj = new ProjectGit();
        
        //Result
        String result = pj.scan();
        System.out.println("Result is : " + result );
        
  }
}

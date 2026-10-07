/*package Basic;

public class pattern {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
*/
/*package Basic;

public class pattern {
    public static void main(String[] args){
        for(int i=1; i<=4; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
*/

/*package Basic;

public class pattern {
    public static void main(String[] args){
        for(int i=1; i<=4; i++){
            for(int j=1;j<=4;j++){
                
                if(i==1 || j==4 || j==1 || i==4){
                    System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
            System.out.println();
        }
    }
    
}*/

/*package Basic;

public class pattern {
    public static void main(String args[]){
        int n = 5;
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){     
                System.out.print("* ");
                } 
            System.out.println();
        }
    }
}*/
/*package Basic;
public class pattern {
    public static void main(String args[]){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){     
                System.out.print("  ");
                } 
                for(int j=1; j<=i; j++){
                        System.out.print("* ");
                    }
            System.out.println();
        }
    }
}*/

/*package Basic;
public class pattern {
    public static void main(String args[]){
        int n = 5;
        int count = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){     
                System.out.print(j + "  ");
                count++;
               }
               System.out.println();
               }
            
        }
    }*/

/*package Basic;
public class pattern {
    public static void main(String args[]){
        int n = 5;
        int count = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){     
                System.out.print(j + "  ");
                //count++;
               }
               System.out.println();
               }
            
        }
    }*/

/*package Basic;
public class pattern {
    public static void main(String args[]){
        int n = 4;
        int count = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){     
                System.out.print(count + "  ");
                count++;
               }
               System.out.println();
               }
            
        }
    }*/
/*package Basic;
public class pattern {
    public static void main(String args[]){
        int n = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){ 

                if((i+j)%2==0 ) {

                System.out.print(" 1 ");
            }
            else
                    {
                    System.out.print(" 0 ");
               }
            }
               System.out.println();
               }
            
        }
    }
*/

package Basic;
import java.util.*;
public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. triangle");
        System.out.println("2.square");
        System.out.println("3.rectangle");
        System.out.println("select one: ");
        int shape = sc.nextInt(); 
        switch (shape) {
            case 1:
                System.out.println("triangle");
                System.out.println("Enter height:");
                int height = sc.nextInt();
                System.out.println("Enter breadth:");
                int breadth = sc.nextInt();
                int area = (height * breadth) / 2;
                System.out.println("Area of triangle: " + area);
                break;
            case 2:
                System.out.println("square");
                System.out.println("Enter side:");
                int side = sc.nextInt();
                int area1 = side * side;
                System.out.println("Area of square: " + area1);
                break;
            case 3:
                System.out.println("rectangle");
                System.out.println("Enter length:");
                int length = sc.nextInt();
                System.out.println("Enter width:");
                int width = sc.nextInt();
                int area2 = length * width;
                System.out.println("Area of rectangle: " + area2);
                break;
            
            default:
                System.out.println("Invalid shape .");
        }
    }
}
package Basic.Day_7;
 import java.io.*;
//  class Throws {
    
//         static void readFile() throws IOException{
//             FileReader file = new FileReader("data.txt");
//             System.out.println("File Opened");
//         }
    
//     public static void main(String[] args) {
//         try{
//             readFile();
//         }
//         catch(IOException e){
//             System.out.println("could not find the file");
//         }
    
// }}

class Throws {
    public static void main(String[] args) {
       int balance = 5000;
       int withdrawal = 7000;

       try{
        if(withdrawal > balance){
            throw new IllegalArgumentException("Insufficient balence");

        }
        balance -= withdrawal;
        System.out.println("withdrawal was successful");
        System.out.println("Remaining balence:"+ balance);
       }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
       }
       System.out.println("program completed");
}}


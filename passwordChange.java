import java.util.Random;
import java.util.Scanner;

class password1{
    private String password;

    Scanner sc = new Scanner(System.in);
    public password1(){
        this.password =this.generate_password1(8);
    }
     //generate random password method
    private String generate_password1(int length){
        Random r = new Random();
        String captialChar="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String samllChar="abcdefghijklmnopqrstuvwxyz";
        String number="12345567890";
        String Schar="!@#$%&*?";
        String value= samllChar+captialChar+number+Schar;
        String password="";
        for(int i=0;i<length;i++){
            password = password+value.charAt(r.nextInt(value.length()));   
        }
        return password;
    }
    public void getInfo(){
    
        System.out.println("This is your one time password:\n "+this.password);
    }
    public void set_password(){
        boolean flage =  false;
        do{
            System.out.println("do you want to change password: (Y/N)");
            char choice=sc.next().charAt(0);
            if(choice=='y'||choice=='Y'){
                flage=true;
                System.out.println("Enter the current password");
                String temp=sc.next();
                if(temp.equals(this.password)){
                    System.out.println("Enter new Password: ");
                    this.password=sc.next();
                    System.out.println("Passwoard Changed Successfully :");
                }
                else{
                    System.out.println("Inccorect Password: ");
                }
            }
            else if(choice=='n'||choice=='N'){
                flage=true;
                System.out.println("Password change option Cancelled!");
            }
                else{
                    System.out.println("Enter valid Choice");
                }
            }while(!flage);
        }
    }

public class passwordChange{
    public static void main(String[] args) {
    password1 p= new password1();
    p.getInfo();
    System.out.println();
    p.set_password();
    }
}
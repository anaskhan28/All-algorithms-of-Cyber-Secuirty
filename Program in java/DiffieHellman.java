import java.util.Scanner; 
public class DiffieHellman {
public static void main(String[] args) {
int publicA,publicB,privateA,privateB,secretA,secretB,x,y; 
Scanner sc = new Scanner(System.in);
System.out.print("Enter public key of s : "); 
publicA = sc.nextInt();
System.out.print("Enter public key of t : "); 
publicB = sc.nextInt();
System.out.print("Enter private key of s : "); 
privateA = sc.nextInt();
System.out.print("Enter private key of t : "); 
privateB = sc.nextInt();
x = (int)(Math.pow(publicB,privateA))%publicA;
y = (int)(Math.pow(publicB,privateB))%publicA;
secretA = (int) (Math.pow(y,privateA))%publicA; 
secretB = (int)(Math.pow(x,privateB))%publicA;
System.out.println("\nSecret key of s : "+secretA); 
System.out.println("Secret key of t: "+secretB);
}
}



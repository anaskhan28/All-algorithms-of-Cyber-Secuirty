import java.util.Random; 
import java.util.Scanner;

public class VernamCipher {
    public static void main(String[] args) {
    String Alphabets = "abcdefghijklmnopqrstuvwxyz";
    
    Random r = new Random();
    String plainText; 
    
    System.out.println("Enter Plain Text : ");
    Scanner sc = new Scanner(System.in); 
    plainText = sc.nextLine();
    plainText = plainText.toLowerCase();
    plainText=plainText.replaceAll(" ","");
    plainText=plainText.replaceAll("  ","");
    plainText=plainText.replaceAll("   ","");
    String charKey[] = new String[plainText.length()]; 
    int key[] = new int[plainText.length()];
    int sum[] = new int[plainText.length()];
    System.out.println("\n-------------------------------------"); 
    System.out.println("Plain text : ");
    for (int i = 0; i < plainText.length(); i++) { 
    System.out.print(plainText.charAt(i)+"\t");
    }
    System.out.println();
for (int i = 0; i < plainText.length(); i++) {
    System.out.print(Alphabets.indexOf(plainText.charAt(i))+"\t"); 
}
for (int i = 0; i < plainText.length(); i++) { 
charKey[i]=
String.valueOf(Alphabets.charAt(r.nextInt(Alphabets.length())));
key[i]=Alphabets.indexOf(charKey[i]); 
}
System.out.println("\n-------------------------------------"); 
System.out.println("\nRandom Keys : ");
for (String i:charKey) { 
System.out.print(i+"\t");
}
System.out.println();
for (int i:key) {
System.out.print(i+"\t"); 
}
for (int i = 0; i < plainText.length(); i++) {
sum[i] = key[i]+Alphabets.indexOf(plainText.charAt(i)); 
}
System.out.println("\n-------------------------------------"); 
System.out.println("\nSum : ");
for (int i = 0; i < plainText.length(); i++) { 
System.out.print(sum[i] + "\t");
}
System.out.println("\n-------------------------------------"); 
System.out.println("\nCipher Text : ");
for (int i = 0; i < plainText.length(); i++) { 
if(sum[i]<25){
    System.out.print(Alphabets.charAt(sum[i])+"\t"); 
}
else if(sum[i]>25){ 
sum[i]=sum[i]-26;
System.out.print(Alphabets.charAt(sum[i])+"\t"); 
}
    }
}
}
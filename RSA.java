import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RSA {
public static void main(String[] args) {
int E = 0, CT;
int P,Q,N;
int D=0; 
double PT;
List<Integer> list = new ArrayList<>(); 
List<Integer> list1 = new ArrayList<>(); 
Scanner sc = new Scanner(System.in);
System.out.println("Enter P (Only primary Number) : ");
P = sc.nextInt();
System.out.println("Enter Q (Only primary Number) : ");
Q = sc.nextInt();
System.out.println("Enter Plain Text in bytes (PT) : "); 
PT = sc.nextInt();
N = P * Q;
System.out.println("N   : " + N); 
int array[] = new int[101];
for (int i = 1; i <= 100; i++) { 
for (int j = 1; j <= 100; j++) {
array[j] = i * j;
if (array[j] == P - 1 || array[j] == Q - 1) { 
list.add(i);
} 
}
}
for (int i : list) {
if (!list1.contains(i)) { 
list1.add(i);
} 
}
System.out.println(list1);
for (int i = 1; i <= list1.size(); i++) {
    if (i != list1.get(i - 1)) { 
        E = i;
        System.out.println("E   : " + i); 
        break;
        } 
        }
        CT = (int) Math.pow(PT, E) % N; 
        System.out.println("CT  : " + CT);
        int X=(P-1)*(Q-1);
        for (int i = 1; i <= 10; i++) { 
        D = ((X*i)+1)/E;
        if((D*E)%X==1){
        System.out.println("D   : "+D); 
        break;
        } 
        }
        PT = Math.pow(CT,D)%N;
        System.out.println("PT  : "+PT);
    }
}
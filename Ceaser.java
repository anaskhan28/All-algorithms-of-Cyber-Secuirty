// public class Ceaser{
//     public static String encrypt(String plainText, int shift){
//         String cipherText = "";
//         for(int i = 0; i < plainText.length(); i++){
//             char c = plainText.charAt(i);
//             if(Character.isLetter(c)){
//                 if(Character.isUpperCase(c)){
//                     cipherText += (char)(((c - 'A' + shift) % 26) + 'A');
//                 }
//                 else{
//                     cipherText += (char)(((c - 'a' + shift) % 26) + 'a');
//                 }
//             }
//             else{
//                 cipherText += c;
//             }
//         }
//         return cipherText;
//     }
//     public static void main(String[] args) {
//         System.out.println(encrypt("Hello World", 26));
//     }
// }

public class Ceaser{

    public static void main(String[] args) {
        String plainText = "Dqdv";
        int shift = 3;
        String cipherText = "";

        for(int i = 0; i < plainText.length(); i++){
            char c = plainText.charAt(i);
            cipherText += (char) (c - shift%26);
        }
        System.out.println(cipherText);

    }
    }


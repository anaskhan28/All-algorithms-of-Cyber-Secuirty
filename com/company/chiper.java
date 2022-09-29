package com.company;

import java.util.Scanner; class CaesarCipher {
    public static void main(String args[])
    { Scanner in = new Scanner(System.in);
        System.out.print("Enter a message : ");
        String msg = in.nextLine();
        int key = 3;
        String cipherText = encrypt(msg, key);
        System.out.println("\nCipher Text : " + cipherText);
        String plaintText = decrypt(cipherText, key);
        System.out.println("\nPlain Text : " + plaintText);
        in.close();
    }
    static String decrypt(String caesar, int key)
    {String res = null;
        char tempmsg[] = caesar.toCharArray();
        for (int i = 0; i < tempmsg.length; i++) {if (tempmsg[i] != ' ') { int temp = (int) tempmsg[i] - key;if (temp < 'A')
        {
            temp ='Z' - ('A' - (temp % 'A') -1);
        }
            tempmsg[i] = (char) temp;
        }
        }
        res = String.valueOf(tempmsg);
        return res;
    }
    static String encrypt(String msg, int key) {String res = null;
        msg = msg.toUpperCase();
        char tempmsg[] = msg.toCharArray();
         for (int i = 0; i < tempmsg.length; i++)
          {if (tempmsg[i] != ' ')
        {
            int temp = (int) tempmsg[i] + key;if (temp > 'Z') {
                temp = 'A' + ((temp - 1) % 'Z');
            }
            tempmsg[i] = (char) temp;
        }
        }
        res =String.valueOf(tempmsg);
        return res;
    }
}


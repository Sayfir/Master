package Task1_2;

import java.util.Scanner;

public class Utils {

//•	Revert strings of list or array

    public static void getReversedString() {
        String[] s = {"Java mentoring program", "Testing", "Epam"};
        for (int i = s.length - 1; i >= 0; i--) {
            char[] ch = s[i].toCharArray();
            char[] ch1 = new char[ch.length];
            for (int j = ch.length -1; j >=0 ; j--) {
            ch1[ch.length-1-j]=ch[j];
            }
            String res = String.valueOf(ch1);
            System.out.print(res);
        }
    }

//Change by places first and last letters in each second string of list or array

    public static void getModifiedArray() {
        String[] s = {"Java", "Mentoring", "Program", "Epam"};
        String res;
        for (int i = 0; i < s.length; i++) {
            if (i % 2 != 0){
                char[] ch = s[i].toCharArray();
                char ch1 = ch[ch.length-1];
                ch[ch.length-1]=ch[0];
                ch[0] = ch1;
                res = String.valueOf(ch);
                System.out.println(res);
            }

            }
        }
    }

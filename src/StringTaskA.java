import java.util.*;
public class StringTaskA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        StringBuilder str = new StringBuilder();
        String t="";
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                str.append('.');
                str.append(Character.toLowerCase(s.charAt(i)));
            }
            else {
                str.append('.');
                str.append((s.charAt(i)));
            }
        }
        for(int i=1; i<str.length(); i=i+2){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                str.deleteCharAt(i-1);
                str.deleteCharAt(i-1);
                i=i-2;
            }
        }
        System.out.println(str);
    }
}


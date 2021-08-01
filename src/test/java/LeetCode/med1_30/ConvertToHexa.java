package LeetCode.med1_30;
import java.util.HashMap;

/**
 * Input: num = 26
 * Output: "1a"
 *  Input: num = -1
 *  Output: "ffffffff"
 *
 * */


public class ConvertToHexa {

    public static String toHex(int num) {
        String res="";
        HashMap<Integer,Character>map = new HashMap<>();
        char digit='0';
        char c = 'a';
        for(int i=0;i<15;i++){
            if(i<10){
                map.put(i,digit);
                digit++;
            }else{
                map.put(i,c);
                c++;
            }
        }

        if(num==0){
            return "0";
        }
        if(num>0){
            int n=num;
            while(n>0){
                res = map.get(n%16)+res;
                n /= 16;
            }
        }else{
            int n=num;
            while(n!=0){
                res = map.get(n%16)+res;
                n /= 16;
            }
        }

        return res;

    }


    public static void main(String[]args){
        int num = 26;
        System.out.println(toHex(num));

    }

}

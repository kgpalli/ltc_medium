package LeetCode.med1_30;

/**
 *Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * */

public class DefangIPAddress {

    public static String defangIPaddr(String address) {
        /*for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ip_address += "["+address.charAt(i)+"]";
            }else
                ip_address += address.charAt(i);
        }*/
        return address.replaceAll("\\.","[.]");
    }


    public static void main (String[]address){
        String ip = "255.100.50.0";

        System.out.println(defangIPaddr(ip));

    }
}

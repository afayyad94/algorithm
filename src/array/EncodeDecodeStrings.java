package array;
/*

Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Please implement encode and decode

Input: ["lint","code","love","you"]
Output: ["lint","code","love","you"]
Explanation:
One possible encode method is: "lint:;code:;love:;you"


 */


import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {


    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for (String str : strs){
            encodedStr.append(str.length()).append("#").append(str);
        }

        return encodedStr.toString();
    }


    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        while(!str.isEmpty()){
            int len = Integer.valueOf(str.substring(0, str.indexOf("#")));
            String word = str.substring(str.indexOf('#')+1, str.indexOf('#')+1 + len);
            result.add(word);
           str =  str.substring(str.indexOf('#') + len  +1, str.length());

        }
        return result;
    }

    public static void main(String[] args) {
        EncodeDecodeStrings encodeDecodeStrings = new EncodeDecodeStrings();
        ArrayList<String> strs = new ArrayList<>();

        strs.add("lint");
        strs.add("code");
        strs.add("love");
        strs.add("you");
        String encodedString = encodeDecodeStrings.encode(strs);
        System.out.println(encodedString);
        encodeDecodeStrings.decode(encodedString);
        System.out.println(encodeDecodeStrings.decode(encodedString));


    }

}

package array.questions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void printFirstNonRepeatingChar(String s){
        Map<Character,String> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                System.out.println("First non repeating character is : "+s.charAt(i));
                break;
            }
            else {
                map.put(s.charAt(i),s);
            }
        }
    }

    static int firstNonRepeating(String str)
    {
        int NO_OF_CHARS = 256;

        // Initialize all characters
        // as absent.
        int arr[] = new int[NO_OF_CHARS];
        for (int i = 0;
             i < NO_OF_CHARS; i++)
            arr[i] = -1;

        // After below loop, the
        // value of arr[x] is going
        // to be index of x if x
        // appears only once. Else
        // the value is going to be
        // either -1 or -2.
        for (int i = 0;
             i < str.length(); i++)
        {
            if (arr[str.charAt(i)] == -1)
                arr[str.charAt(i)] = i;
            else
                arr[str.charAt(i)] = -2;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < NO_OF_CHARS; i++)

            // If this character occurs
            // only once and appears before
            // the current result, then
            // update the result
            if (arr[i] >= 0)
                res = Math.min(res, arr[i]);

        return res;
    }

    public static void main(String args[]){
        String s1 = "GeeksforGeeks";
        String s2 = "GeeksQuiz";
        printFirstNonRepeatingChar(s1);
        printFirstNonRepeatingChar(s2);

        int index = firstNonRepeating(s1);
        if (index == Integer.MAX_VALUE)
            System.out.print("Either all characters are " +
                    "repeating or string is empty");
        else
            System.out.print("First non-repeating character"+
                    " is " + s1.charAt(index));
    }
}

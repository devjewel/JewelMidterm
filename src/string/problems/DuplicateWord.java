package string.problems;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
    }
    public static void duplicate(String str){
        String[]a = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String n:a){
            Integer duplicate = map.get(a);
            if(duplicate==null){
                duplicate=0;
            }else{
                map.put(n,duplicate+1);

            }
        }
        for (Map.Entry<String,Integer> e:map.entrySet()){


        }

        }
    }




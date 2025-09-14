import java.util.HashMap;

public class Anagram {
    
    public boolean isAnagram(String s, String t) {
      
        if(s.length() != t.length()){
             return false;
           }
             
          HashMap<Character, Integer> s1 = new HashMap<>();
          HashMap<Character, Integer> s2 = new HashMap<>();
     
          for(char ss : s.toCharArray()){
             s1.put(ss, s1.getOrDefault(ss, 0) + 1);
     
          }
     
     
          for(char pp : t.toCharArray()){
             s2.put(pp, s2.getOrDefault(pp, 0) + 1);
     
          }
     
     
          if(s1.equals(s2)){
             return true;
          }
     
     
          return false;
     
     
     
     
     
     
     
          }
     }
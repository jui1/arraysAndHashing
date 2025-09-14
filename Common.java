import java.util.*;

public class Common {
    public static void main(String[] args) {
        
    }

    public String longestCommonPrefix(String[] strs) {

      
        //       ["flower","flow","flight"]
        
        //        == ["flight" , ,"flow", "flower"];
        
        
        //         first = "flower";
        //         last = "flight";
        
        //         for( 0 se length){
        //             f != f 
        //  brk ;
        //   ekse{
        //     and.add(char[0]);
        //   }
        
        //         }
        
        
        
        
        StringBuilder and = new StringBuilder();
        
        Arrays.sort(strs);
        
         char[] start = strs[0].toCharArray();
         char[] end =  strs[strs.length-1].toCharArray();
        
         for(int i= 0 ;i<start.length;i++){
            if(start[i] != end[i]){
                break;
            }
        
            and.append(end[i]);
         }
        
        
        
        return and.toString();
        
        
        
        
        
            }
        }
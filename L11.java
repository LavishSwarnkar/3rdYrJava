//Size and all occurrences in string
import java.util.*;
class L11{
    public static void main(String args[]){
        String name = "Lavish Swarnkar";
        System.out.println("Length of string \"" + name + "\" is " + name.length());
        
        List<Integer> indices = new ArrayList<Integer>();
        int i = 0;
        while(i != -1){
            i = name.indexOf("a", i);
            if (i != -1) {
                indices.add(i);
                i++;
            }
        }
        System.out.println(indices.size() + " 'a' found at indices " + indices.toString());
    }
}
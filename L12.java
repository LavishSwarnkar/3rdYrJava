//StringBuffer append character, capacity and length

import java.util.ArrayList;
import java.util.List;

class L12 {
    public static void main(String args[]){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('L').append('S');

        System.out.println(stringBuffer.toString()
                + ", capacity = " + stringBuffer.capacity()
                + ", length = " + stringBuffer.length());
    }
}
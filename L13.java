//StringBuffer insert at beginning

class L13 {
    public static void main(String args[]){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('B').append('C').insert(0, 'A');

        System.out.println(stringBuffer.toString());
    }
}
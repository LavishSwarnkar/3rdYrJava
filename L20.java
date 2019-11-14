//Catch >2 Exceptions

public class L20 {

    public static void main(String args[]){
        try {
            int a=0, b=5/a, c[] = new int[2];
            c[2] = 5;
            c[0] = Integer.parseInt("y");
        }catch (ArithmeticException | IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
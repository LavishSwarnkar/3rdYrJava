//Multithreading

public class L22 {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                for(int i=0 ; i<=10 ; i+=2)
                    System.out.println("Even : " + i);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                super.run();
                for(int i=1 ; i<10 ; i+=2)
                    System.out.println("Odd : " + i);
            }
        }.start();
    }

}
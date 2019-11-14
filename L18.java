//Implement 2 interfaces

class L18 {

    interface Interface1{
        void method1(int x);
    }

    interface Interface2{
        void method2(String s);
    }

    static class Class1 implements Interface1, Interface2{
        @Override
        public void method1(int x) {
            System.out.println(x);
        }

        @Override
        public void method2(String s) {
            System.out.println(s);
        }
    }

    public static void main(String args[]){
        Class1 object = new Class1();
        object.method1(200);
        object.method2("OK");
    }
}
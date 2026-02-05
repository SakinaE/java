public class test2{

    public static void main(String[]args){
        method1();
        Display obj = new Display();
        obj.method3();
        Data obj2 = new Data();
        obj2.method4();
    }

    public static void method1(){
        System.out.println("hello");
        method2();
    }
    public static void method2(){

        System.out.println("java");
    }
    static class Display{
        public static  void method3(){

            System.out.println("world");
        }

    }
    static class Data{
        public static void method4(){
            System.out.println("developers");
        }

    }

}
public class arguments {
    public static void main(String[]args){
        int a = 9,b = 6;
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(divide(a,b));
        System.out.println(multiply(a,b));
        System.out.println(modulo(a,b));

    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int modulo(int a, int b){
        return a%b;
    }
}

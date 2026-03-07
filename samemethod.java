public class samemethod {
    public static void main(String[]args){
        int a = 9,b = 6,c = 7;

        System.out.println(add(a,b));
        System.out.println(add(a,b,c));

    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
}

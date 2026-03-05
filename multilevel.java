public class multilevel {

    public static void main(String[] args) {
        Display();

        classX obj1 = new classX();
        obj1.White();
        classY obj2 = new classY();
        obj2.White();
        classZ obj3 = new classZ();
        obj3.White();

    }

    public static void Display() {
        System.out.println("welcome");
    }
}

    class classV {
    public void White() {
        System.out.println("black");
    }
}

class classX extends classV {

    public void White() {
        System.out.println("pink");
    }
}

class classY extends classX {

    public void White() {
        System.out.println("color");
    }
}

class classZ extends classY {
    public void White() {
        System.out.println("wings");
    }
}

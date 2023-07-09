interface A {
    void disp1();

    void disp2();

    int x = 10;
}

interface B extends A {
    void disp3();

}

class Imp implements B {
    // int x=90;
    public void disp1() {
        System.out.println("implement disp1");
    }

    public void disp2() {
        System.out.println("implement disp2");
    }

    public void disp3() {
        System.out.println("implement disp3");
    }
}

class ExtInterface {
    public static void main(String args[]) {
        Imp im = new Imp();
        im.disp1();
        im.disp2();
        im.disp3();
        // im.x=100;//comment and uncomment this
        System.out.println(im.x);
    }
}
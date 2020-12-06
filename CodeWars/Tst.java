package CodeWars;

public class Pattern {
    public static void main(String[] args) {
        String a = new String("Hello Kitty!");
        String b = "Hello Kitty!";
        if(a==b)
            System.out.println(1);
        else System.out.println(2);
    }
}

class Tst2{
    public Tst2(){
        System.out.println(2);
    }
}

class Tst extends Tst2{
    public Tst(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Tst c =new Tst();
    }
}
package Lab_10;

public class Main {

    public static void main(String[] args){
        Dog d1 = new Dog("Bim");
        Cat c1 = new Cat("Luna");
        System.out.println(d1.run(400));
        System.out.println(c1.run(400));
        System.out.println(d1.swim(50));
        System.out.println(c1.swim(50));
        System.out.println(d1.jump(4));
        System.out.println(c1.jump(4));
    }


}

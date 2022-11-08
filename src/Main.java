public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("Ilim","work","PeakSoft");
        Dancer dancer=new Dancer("Nurik","Hobbi","Spice");
        Singer singer=new Singer("Sanjar","earn","BlackStar");

        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();
        System.out.println();
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();
        System.out.println();
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGitar();
    }
}
public class Sephian {
    void status(){
        System.out.println("Sephian is live object!");
    }
}
class Human extends Sephian{
    @Override
    void status() {
        System.out.println("Human is live object");
    }
}
class Man extends Human{
    @Override
    void status() {
        System.out.println("Man is live object");
    }
}
class Gawesh extends Man{
    @Override
    void status() {
        System.out.println("Gawesh is live object");
    }
}
class Test{
    public static void main(String[] args) {
        Sephian s = new Sephian();
        Sephian h = new Human();
        Sephian m = new Man();
        Sephian g = new Gawesh();
        s.status();
        h.status();
        m.status();
        g.status();

    }
}
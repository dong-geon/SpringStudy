public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        System.out.println("Adapter's request()" +
                " method is called.");
        adaptee.specificRequest();
    }
}

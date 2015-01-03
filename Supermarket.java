
public class Supermarket {
    public static void main(String[] args) {
        Supermarket mySupermarket = new Supermarket();
        mySupermarket.launch();
    }
    public void launch()
    {
        PersonQueueImpl meatCounterQueue = new PersonQueueImpl();
        PersonQueueImpl checkoutCounterQue = new PersonQueueImpl();

    }
    public void addPerson(Person myPerson)
    {

    }
    public Person servePerson()
    {
        Person myPerson = new Person ("NoName");
        return myPerson;
    }
}

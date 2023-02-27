
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.receiveCall("leha");
        phone.sendMessage(new String[] { "222", "22222222", "222", "122", "22232" });
        Phone ph1= new Phone("856848", "сиоми 3848348");
        Phone ph2 = new Phone("89005553535", "xiomi 123", 123);
        ph1.receiveCall("Военкомат", "89005553434");
        System.out.println(ph2.getNumber());
    }
}
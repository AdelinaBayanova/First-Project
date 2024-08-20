package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = "89195284711";
        phone1.model = "Iphone 10";
        phone1.weight = 0.234;

        Phone phone2 = new Phone();
        phone2.number = "89378574701";
        phone2.model = "Iphone 11";
        phone2.weight = 0.341;

        Phone phone3 = new Phone();
        phone3.number = "89854100234";
        phone3.model = "Iphone 13 plus";
        phone3.weight = 0.412;

        System.out.println("Номер телефона " + phone1.number
                + ", модель телефона " + phone1.model
                + ", вес телефона " + phone1.weight);

        System.out.println("Номер телефона " + phone2.number
                + ", модель телефона " + phone2.model
                + ", вес телефона " + phone2.weight);

        System.out.println("Номер телефона " + phone3.number
                + ", модель телефона " + phone3.model
                + ", вес телефона " + phone3.weight);

        System.out.println("---------------------------------");

        phone1.receiveCall("Olga");
        phone2.receiveCall("Anna");
        phone3.receiveCall("Mark");

        System.out.println("---------------------------------");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

    }
}

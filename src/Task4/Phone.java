package phone;

import java.sql.SQLOutput;

public class Phone {

    //переменные
    String number;
    String model;
    Double weight;

    //методы
    public void receiveCall(String nameCaller) {
        System.out.println("Звонит " + nameCaller);
    }

    public String getNumber() {
        return number;
    }
}


interface iBank {
    void withdrawal(); // public abtract

    void check_balance();
}

class SBI implements iBank {
    public void withdrawal() {
        System.out.println("withdrawal from SBI");
    }

    public void check_balance() {
        System.out.println("check balance from SBI");
    }
}

class Axis implements iBank {
    public void withdrawal() {
        System.out.println("withdrawal from Axis");
    }

    public void check_balance() {
        System.out.println("check balance from Axis");
    }
}

public class Main789 {
    public static void main(String[] args) {
        iBank ref =  new Axis(); // cannot create object of an interface
        ref.withdrawal();
        ref.check_balance();
        SBI ob = new SBI();
        ob.check_balance();
    }
}
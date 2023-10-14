public class Validate {

    private int[] validNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 
                                    8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 
                                    1005231, 6545231, 3852085, 7576652, 7881200, 4581002};

    public boolean validate(int accountNumber) {
        for (int i = 0; i < validNumbers.length; i++) {
            if (accountNumber == validNumbers[i]) return true;
        }
        return false;
    }
}
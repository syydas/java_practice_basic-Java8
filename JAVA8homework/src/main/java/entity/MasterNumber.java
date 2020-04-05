package entity;

public class MasterNumber {

    private String number;

    public String getNumber() {
        return number;
    }

    public MasterNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MasterNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
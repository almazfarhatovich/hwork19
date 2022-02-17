package com.company;

public class Family implements Flat, Obshaga, Hotel {
    private int number;
    private String address;

    public Family() {
    }

    public Family(int number, String address) {
        this.number = number;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void komUslug() {
        System.out.print("5000 сом коммуслуга толойт");
    }

    @Override
    public void arendobsh() {
        System.out.print("1000 сом айына толойт");
    }

    @Override
    public void arendaHotel() {
        System.out.print("1000 сом кунуно толойт");
    }

    @Override
    public String toString() {
        return "Family:\n" +
                "number:" + number + " адам жашайт\n" +
                "address:" + address;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Family family1 = new Family(4,"Гагарина 139ж");
        Family family2 = new Family(1,"Малдыбаева 14");
        Family family3 = new Family(2,"Магистральная 15");

        System.out.println(family1);
        family1.komUslug();
        System.out.println("\n");
        System.out.println(family2);
        family2.arendobsh();
        System.out.println("\n");
        System.out.println(family3);
        family3.arendaHotel();
        System.out.println("\n");
    }
}

//        1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
//        2. Квартирада жашагандар ком услуга толошот
//        3. Общежитие менен гостиницада жашагандар аренда толошот
//        4. Уй-булолор бир канча адамдан турушат
//        5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
//        6. Жашоо демек озунун адресин корсотуу
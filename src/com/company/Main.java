package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

////Например, у нас есть интерфейс IAccount, который представляет счет в банке.
////И мы хотим, чтобы в банке хранился набор подобных счетов. Однако мы не можем знать,
////какой вид счета будет в банке в данном случае будет использоваться. поэтому мы можем
////установить ограничение в виде типа IAccount:   interface IAccount {int getID();}
////
////Тогда обобщенный класс Bank, который хранит информацию о счетах, может иметь
////подобное определение:class Bank<T extends IAccount> {T[] accounts;}
////С помощью выпажения T extends IAccount мы указываем на, что используемый
////тип Т должен представлять класс, который реализует интерфейс IAccount.
////
////Необходимо реализовать данный интерфейс классом счетов(назовем его Account).
////В классе Bank реализовать метод, выводящий (вывод на экран) информацию обо всех
////"аккаунтах" данного объекта "Банк". список счетов должен передаваться  при создании
////в конструктор класса "Банк".
////А некий класс-клиент должен создать массив конкретных счетов , передать его в создаваеемый
////объект "Банк". Затем этот же класс-клиент должен вывести информацию обо всех счетах данного "Банка",
////вызовом соответствующего метода объекта "Банк"
//import java.util.ArrayList;
public class Main {
    //
//    interface IAccount {
//        int getID();
//    }
//    static class Account implements IAccount {
//        int ID = 0;
//        public Account(int ID) { //
//            this.ID = ID;
//        }
//        @Override
//        public String toString() {
//            return "Account ID: " + getID();
//        }
//        @Override
//        public int getID() {
//            return this.ID;
//        }
//        class Bank<T extends IAccount> {
//            T[] accounts;
//
//            public Bank(T[] accounts) {
//                this.accounts = accounts;
//            }
//        }
//    }
    public static void main(String[] args) {

        Random random = new Random(36);
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            // Создадим число от 0 до 10
            int number = random.nextInt(10);
            Integer frequency = hashMap.get(number);
            hashMap.put(number, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);//       Account ac = new Account(1);
//       Account ac2 = new Account(2);
//       Account ac3 = new Account(5);
//       Account ac4 = new Account(1258);
//        ArrayList<Account>acList = new ArrayList<>();
//        acList.add(new Account(1));
//        acList.add(new Account(25));
//        acList.add(new Account(85));
//        acList.add(new Account(143));
//        for (Account tmp: acList) System.out.println(tmp.toString());
//
//    }
//}
//
//
//
//
    }
}
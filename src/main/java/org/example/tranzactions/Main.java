//package org.example.tranzactions;
//
//
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//
//    MainProxy mainProxy;
//
//    @Transactional
//    public void foo() {
//        System.out.println("Db avelcrec");
//        System.out.println("Db avelcrec 2");
//        mainProxy.boo();
//    }
//
//    @Transactional
//    public void boo() {
//        System.out.println("Db avelcrec 3");
//        System.out.println("Db avelcrec 4");
//    }
//
//}
//
//class MainProxy {
//
//    Main main;
//
//    public void foo() {
//        System.out.println("begin transaction");
//        main.foo();
//        System.out.println("commit transaction");
//    }
//
//    public void boo() {
//        System.out.println("begin transaction");
//        main.boo();
//        System.out.println("commit transaction");
//    }
//}
//
//class Controller {
//
//    MainProxy main;
//
//    void post() {
//        main.foo();
//    }
//}

package day27_AccessModifiers;

public class Test_Data {
    public static void main(String[] args) {

        Data obj =new Data();

        System.out.println(obj.a+obj.b+ obj.c);
        obj.method1();
        obj.method2();

        System.out.println(Data.d+Data.e+Data.f);
        Data.method3();
        Data.method4();

    }
}

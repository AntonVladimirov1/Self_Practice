package day25_Constructor;

public class Test_Rectangle {
    public static void main(String[] args) {

      /*  Rectangle_CustomClass rectangle1 = new Rectangle_CustomClass();
        rectangle1.setInfo(3,4);
        Rectangle_CustomClass rectangle2 = new Rectangle_CustomClass();
        rectangle2.setInfo(3,4);
        Rectangle_CustomClass rectangle3 = new Rectangle_CustomClass();
        rectangle3.setInfo(3,4);
        Rectangle_CustomClass rectangle4 = new Rectangle_CustomClass();
        rectangle4.setInfo(3,4);
        Rectangle_CustomClass rectangle5 = new Rectangle_CustomClass();
        rectangle5.setInfo(3,4);  */

        Rectangle_CustomClass rectangle1 = new Rectangle_CustomClass(3,4);
        Rectangle_CustomClass rectangle2 = new Rectangle_CustomClass(5,5);
        Rectangle_CustomClass rectangle3 = new Rectangle_CustomClass(8,4);
        Rectangle_CustomClass rectangle4 = new Rectangle_CustomClass(3,6);
        Rectangle_CustomClass rectangle5 = new Rectangle_CustomClass(7,4);

        System.out.println(rectangle1);
       // System.out.println(rectangle2);
       // System.out.println(rectangle3);
        //System.out.println(rectangle4);
        //System.out.println(rectangle5);

    }

}

package day31_Method_Overriding.Overriding.Animals;

import day31_Method_Overriding.Overriding.Animals.Animals;

public class Lion_toStringOverride extends Animals {

    private boolean isAfrican;

    public Lion_toStringOverride(String name, String breed, char gender, int age, String size, String color, boolean isAfrican) {
        super(name, breed, gender, age, size, color);
        setAfrican(isAfrican);
    }

    public boolean isAfrican() {
        return isAfrican;
    }
    public void setAfrican(boolean african) {
        isAfrican = african;
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking water");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating others");
    }
    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 7 hours");
    }

    @Override
    public String toString() {
         return super.toString() +
         ", isAfrican = '" + isAfrican + '\'' + '}';

       /* return getClass().getSimpleName()+" {" +
                "name = '" + getName() + '\'' +
                ", breed = '" + getBreed() + '\'' +
                ", gender = " + getGender() +
                ", age = " + getAge() +
                ", size = '" + getSize() + '\'' +
                ", color = '" + getColor() + '\'' +
                ", isAfrican = '" + isAfrican + '\''; */     // +
               // '}';
    }
}

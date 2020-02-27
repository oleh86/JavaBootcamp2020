package sef;

public class JUnit {
    public static void main(String[])
    {
        JUnit JT = new JUnit();
        JT.add(3,5);
        System.out.println("Unit test!" + JT.add(3,5));
    }
    public int add(int num1, int num2){
        return num1+num2;
    }
}

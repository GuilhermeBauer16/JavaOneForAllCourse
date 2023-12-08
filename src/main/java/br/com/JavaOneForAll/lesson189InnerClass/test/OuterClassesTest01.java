package br.com.JavaOneForAll.lesson189InnerClass.test;

public class OuterClassesTest01 {

    private String name = "Guilherme";
    class Inner{
        public void printInnerClassAttributes(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {

        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        inner.printInnerClassAttributes();

    }
}

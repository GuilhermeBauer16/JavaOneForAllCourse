package br.com.JavaOneForAll.lesson189InnerClass.test;

public class OuterClassesTest03 {

    protected String name = "Guilherme";
    static class Inner{
        public void printInnerClassAttributes(){
            System.out.println(new OuterClassesTest03().name);
        }
    }
    public static void main(String[] args) {

        OuterClassesTest03 outerClassesTest01 = new OuterClassesTest03();
        Inner inner = new Inner();
        inner.printInnerClassAttributes();

    }
}

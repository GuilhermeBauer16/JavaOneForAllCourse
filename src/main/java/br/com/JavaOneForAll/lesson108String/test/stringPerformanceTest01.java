package br.com.JavaOneForAll.lesson108String.test;

public class stringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with string " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with stringBuilder " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with stringBuffer " + (end - begin) + " ms");
    }

    private static void concatString(int size){
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size){
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size){
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}

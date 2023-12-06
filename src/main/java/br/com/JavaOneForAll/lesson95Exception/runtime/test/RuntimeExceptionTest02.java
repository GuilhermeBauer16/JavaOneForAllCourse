package br.com.JavaOneForAll.lesson95Exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IllegalAccessException {
        divide(1, 0);
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalAccessException if b is zero
     */
    private static int divide(int a, int b) throws IllegalAccessException {

        if (b == 0) {
            throw new IllegalAccessException("The second parameter can't be zero");
        }
        return a / b;
    }
}

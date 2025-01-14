package com.mysegmentfault.deep.in.java.concurrency;

public class SynchronizedDemo {

    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class) {
            Data data = new Data();
            data.setValue(1);
        }
    }
    private static class Data{
        private volatile int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}

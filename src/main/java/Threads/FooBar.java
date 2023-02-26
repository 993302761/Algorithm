package Threads;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    BlockingDeque<Integer> foo=new LinkedBlockingDeque<>(1);
    BlockingDeque<Integer> bar=new LinkedBlockingDeque<>(1);

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; ) {
            foo.put(i);
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.put(i);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; ) {
            bar.take();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.take();
        }
    }

}

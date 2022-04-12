package Tutorial.InterfaceT;

public class InterfaceT {
        public static void main(String[] args) {
            // write your code here
            InterfaceT main = new InterfaceT();
            System.out.println("main : current thread id is " + Thread.currentThread().getId());
            System.out.println("calling main");
            main.asyncPrint(() -> {
                System.out.println("Printing completed");
            });
            System.out.println("called main");
        }

        public void asyncPrint(Callback callback) {
            Thread t = new Thread(() -> {
                System.out.println("new thread : current thread id is " + Thread.currentThread().getId());
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    if (i == 9) {
                        callback.callMe();
                    }
                }
            });
            t.start();
        }

        public void syncPrint () {
            System.out.println("SyncPrint : current thread id is " + Thread.currentThread().getId());
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }


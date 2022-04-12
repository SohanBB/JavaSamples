package Tutorial.ThreadIN;

class ThreadIN {
    public static void main(String[] args) {
        MyThread myT = new MyThread();
        CallBack callBack = new CallBack() {
            @Override
            public void callStart() {
                System.out.println("Printing started");
            }

            @Override
            public void callEnd() {
                System.out.println("Printing Ended");
            }

            @Override
            public void onEvery(int i) {
                System.out.println(i);
            }
        };
        myT.print1to10(callBack);
        myT.t.start();
    }
}

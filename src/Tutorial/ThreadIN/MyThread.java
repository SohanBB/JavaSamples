package Tutorial.ThreadIN;

public class MyThread {
    Thread t;
    public void print1to10(CallBack callBack){
        t =  new Thread(()->{
            for (int i=0;i<=10;i++) {
                if (i == 0) {
                    callBack.callStart();
                }
                callBack.onEvery(i);
                if (i == 10) {
                    callBack.callEnd();
                }
            }
        });
    }
}

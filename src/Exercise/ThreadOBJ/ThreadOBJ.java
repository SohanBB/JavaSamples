package Exercise.ThreadOBJ;

public class ThreadOBJ extends Thread{
    public void run (){
        System.out.println("Hello from Thread !!");
    }

    public static void main(String[] args)  {
        ThreadOBJ th = new ThreadOBJ();
        th.run();
        System.out.println(th.getId());
        System.out.println(th.getPriority());
        th.setPriority(10);
        System.out.println(th.getPriority());

    }
}

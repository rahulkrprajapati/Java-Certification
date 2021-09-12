public class hack_thread extends Thread {
    @Override
    public void run() {
        for(int h=1;h<=3; h++){
            try{
                Thread.sleep(10);
            }
            catch(Exception hackerearth){
                System.out.println("hello");
            }
            System.out.println(h + " ");
        }
    }
    public static void main(String[] args) {
        hack_thread h1 = new hack_thread();
        hack_thread h2 = new hack_thread();
        h1.start();
        try {
            h1.join();
        } catch (Exception hackerearth) {
            //TODO: handle exception
            System.out.println("hi");
        }
        h2.start();
    }
}

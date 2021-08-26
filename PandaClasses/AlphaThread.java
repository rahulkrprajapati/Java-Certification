package PandaClasses;

public class AlphaThread extends Thread{
    char ch = 'A';
    int nt = 0;
    int it = 0;
    int thisThread=0;
    AlphaThread(int nt,int it, int thisThread){
        this.nt = nt;
        this.it = it;
        this.thisThread = thisThread;

    }
    public void run(){
    	
        for (int i = 0; i < it; i++) {
            
            try{
                Thread.sleep(thisThread*nt*1000);
            	System.out.println( thisThread + " - " + ch);
                ch += 1;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    
}

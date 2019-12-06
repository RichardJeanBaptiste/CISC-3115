import java.io.*;
import java.lang.*;

class HolidayThread {

    static class fa implements Runnable{
        String fa = "Fa ";
        int num;

        public fa (int n){
            num = n;
        }
        public void run(){
            
            System.out.print(fa);

            for(int i = 0; i < num; i++){
                Thread.yield();
            }
        }
        
    }


    static class la implements Runnable{

        String la = "La ";
        int num;

        public la (int n) {
            num = n;
        }

        public void run(){
            go();
        }

        public void go(){
            for(int i = 0; i < num; i++){
                System.out.print(la);
            }
        }

    }

    public static void main(String[] args){
        

        Runnable faJob = new fa(8);
        Thread faThread = new Thread(faJob);

        Runnable laJob = new la(8);
        Thread laThread =  new Thread(laJob);


        faThread.start();
        laThread.start();

    }
}

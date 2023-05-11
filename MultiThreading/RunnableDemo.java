
class RunnableDemo implements Runnable{
    String tname;
    RunnableDemo(String n){
        tname = n;
        System.out.println("Creating: " + tname);
    }
    public void run(){
        System.out.println("Running:" + tname);
    
    try{ 
        for(int i = 4; i > 0; i-- ){
            System.out.println("Thread"+tname + "printing:"+i);
            Thread.sleep(50);
        }
    }
    catch(InterruptedException e){
        System.out.println("Thread" + tname + "Interrupted");

    }
    System.out.println("Thread:"+ tname + "existing");
}
}

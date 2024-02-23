package threads.pool;

class WorkerThread implements Runnable {
    String jobno;
    public WorkerThread(String s){
        this.jobno = s;
    }

    @Override
    public void run() {
        //print thread name
        //do the job
        //print done with the job

        System.out.println(Thread.currentThread().getName() + " start " + jobno);
        doJob();
        System.out.println(Thread.currentThread().getName() + " end " + jobno);

    }

    private void doJob() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

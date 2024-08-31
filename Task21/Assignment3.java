import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Assignment3 {
    public static void main(String[] args) {

        int jobCount = 0;
        Scanner sc = new Scanner(System.in);
        int totalBurstTime = 0;

        Queue<Job> scheduler = new LinkedList<>();

        System.out.println("Enter the number of jobs you want to create: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)  {
            System.out.println("Enter the burst time of the job");
            int burstTime = sc.nextInt();
            Job job = new Job(burstTime, totalBurstTime, ++jobCount);
            totalBurstTime += burstTime;
            scheduler.add(job);
        }

        Iterator<Job> itr = scheduler.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }

    }
}

class Job   {
    int burstTime;
    int waitingTime;
    int jobID;
    Job(int burstTime, int waitingTime, int jobID)    {
        this.burstTime = burstTime;
        this.waitingTime = waitingTime;
        this.jobID = jobID;
    }

    public String toString()   {
        return "Burst Time of the Job" + jobID + " is: " + burstTime + " Waiting time of the Job is: " + waitingTime;

    }

}

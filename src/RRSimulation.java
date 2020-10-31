public class RRSimulation {
 
  // NO MORE INSTANCE VARIABLE CAN BE DEFINED
  private Ring jobs;

  // DO NOT MODIFY THE CONSTRUCTOR
  public RRSimulation() {
    jobs = GenJob.genInitJobList();
    System.out.println("The original job list is:");
    System.out.println(jobs);
  }
  
  public void run(int unit) {
	  Job job;
	  int r = 0;
	  
	  while (jobs.size() != 0) {
		  job = (Job) jobs.getCurrObj();
		  System.out.println("Job being served: " + job);
		  if(job.served(unit) > 0) {
			  jobs.advance();
			  System.out.println("The current job list is: " + jobs);
		  }
		  else {
			  jobs.removeCurrObj();
			  System.out.println(job + " is done.");
			  System.out.println("The current job list is: " + jobs);
		  }
		  r++;
	  }
	  System.out.println("All jobs finished after " + r * unit + " hours.");
  }
}

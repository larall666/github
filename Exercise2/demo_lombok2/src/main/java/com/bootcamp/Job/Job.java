package com.bootcamp.Job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Job {
  private int workload;
  private int staff;
  private int Allowance;
  public static void main(String[] args) {
    Job job = new Job(80,25,100);
    // job.setworkload(80);
    // job.setstaff(25);
    job.setAllowance(100);

    System.out.println(job.toString());
  

  }
}

public class Job {

  public static void main(String[] args) {
    Job job = new Job();
    job.setworkload(80);
    job.setstaff(25);
    job.setAllowance(100);

    System.out.println(job.toString());
    System.out.println(job.staffworkload());
    System.out.println(job.totalAllowance());

  }
  private int workload;
  private int staff;
  private int Allowance;

  public void setworkload (int workload){
    this.workload = workload;
  }
  
  public int getworkload(){
    return this.workload;
  }

  public void setstaff (int staff){
    this.staff = staff;
  }
  
  public int getstaff(){
    return this.staff;
  }

  public void setAllowance (int Allowance){
    this.Allowance = Allowance;
  }
  
  public int getAllowance(){
    return this.Allowance;
  }

  // public String toString(){
  //   return "dog("
  //   +"workload="+this.workload
  //   +",staff=" +this.staff
  //   +", Age="+this.Allowance
  //   +")";
  // }

  public int staffworkload(){
    return this.workload / this.staff;
}

public int totalAllowance(){
  return this.Allowance * this.staff;
}
}
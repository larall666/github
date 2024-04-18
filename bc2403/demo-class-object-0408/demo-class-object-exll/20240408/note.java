public class note {
  
  public static void main(String[] args) {
    note note = new note();
    note.setpaper(50);
    note.settype(2);
    note.setuser(30);

    System.out.println(note.toString());
    System.out.println(note.totalnote());
    System.out.println(note.totalpaper());
  }

  private int user;
  private int type;
  private int paper;

  public void settype (int type){
    this.type = type;
  }

  //   public int gettype(){
  //   return this.type;
  // }

  public void setuser (int user){
    this.user = user;
  }

  public int getuser(){
    return this.user;
  }

  public void setpaper (int paper){
    this.paper = paper;
  }

  public int getpaper(){
    return this.paper;
  }

  public String toString(){
    return "user=" + this.user + ", type=" + this.type;
    
  }

    public int totalnote(){
      return this.user * this.type;
  }

  public int totalpaper(){
    return this.paper * this.type;
}

}

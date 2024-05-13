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

public class Note {
  private int usercount;
  private int type;
  private int paper;

  public static void main(String[] args) {
    Note note = new Note(50,2,30);
     note.setPaper(50);
    note.setType(2);
  note.setUsercount(30);
  System.out.println(note);

   System.out.println(note.getPaper());
   note.setType(5);
//System.out.println(note);

    System.out.println(note.toString());
   
  }
}

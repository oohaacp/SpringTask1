package com.stackroute.domain;

public class Movie
{
   private String mov_name;
   Actor actor;
   public void setActor(Actor actor) {
       this.actor = actor;
   }

    public String getMov_name()
    {
        return mov_name;
    }

    public void setMov_name(String mov_name)
    {
        this.mov_name = mov_name;
    }
    public void display()
    {
        System.out.println(" "+ actor.getName()+" "+ actor.getGender()+" "+ actor.getAge());

}
}

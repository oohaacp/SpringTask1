package com.stackroute.domain;

public class Movie
{
   private String m_name;
   Actor actor;
   public void setActor(Actor actor) {
       this.actor = actor;
   }

    public String getM_name()
    {
        return m_name;
    }

    public void setM_name(String m_name)
    {
        this.m_name = m_name;
    }
    public void display()
    {
        System.out.println(" "+ actor.getName()+" "+ actor.getGender()+" "+ actor.getAge());

}
}

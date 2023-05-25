package Linkedlist;

public class Linkedlistdemo 
{
   int id,marks;
   String name,subject;
   Character rank;
   Linkedlistdemo(int id, int marks, String name, String subject, Character rank)
   {
	   this.id=id;
	   this.marks=marks;
	   this.name=name;
	   this.subject=subject;
	   this.rank=rank;
	   
   }
   public String tostring()
   {
	return this.id+" "+this.name+" "+this.subject+" "+this.marks+" "+this.rank;
	   
   }
}

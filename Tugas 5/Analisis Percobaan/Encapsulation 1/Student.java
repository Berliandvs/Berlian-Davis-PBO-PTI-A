// NO 4 (bisa)
package Encapsulation1;

public class Student { 
    private String name; 
    private int mark;
    // NO 3 (jadi tidak bisa diakses di kelas lain)
    public void setName(String n){ 
       name=n; 
    } 
    public String getName(){ 
       return name; 
    }     
    public void setMark(int m){ 
       mark=m; 
    }     
    public int getMark(){ 
       return mark; 
    } 
}

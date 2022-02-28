package School;

import java.util.List;

public class Student {
    String name;
    int roll;
    List<Double> marks;
    double perecent;
    public Student(String name,int roll,List<Double> marks,double perecent)
    {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
        this.perecent = perecent;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setRoll(int roll)
    {
        this.roll = roll;
    }
    public int getRoll()
    {
        return this.roll;
    }
    
    public void setPercent(double perecent)
    {
        this.perecent = perecent;
    }
    public double getPercent()
    {
        return this.perecent;
    }
    
    public void setMarks(List<Double> marks)
    {
        this.marks = marks;
    }
    public List<Double> getMarks()
    {
        return this.marks;
    }
}

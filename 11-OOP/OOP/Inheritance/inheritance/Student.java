public class Student extends Person {
    private String collegeName;
    private int year;

    public Student(String name, String collegeName){
        //super keyword in Java is a reference variable which is used to refer immediate parent class object.
        super(name);
        this.collegeName = collegeName;
    }

    public String getCollegeName(){
        return collegeName;
    }

    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
}

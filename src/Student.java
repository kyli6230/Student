
public class Student {
    /*
    Step 1: start with instance variables
    these make up the properties of your object
    always make them private because...
    As a class designer you want to dictate HOW a property gets set
    Typically you force programmers to use public methods to set properties of an object
    this way, you can apply rules to the method that will reject invalid data for a property
     */
    private String name;
    private int test1;
    private int test2;
    private int test3;

    /*
    Step 2: Constructor method (2)
    this initializes the method
    gives data to the properties
    this code runs when the word "new" is used elsewhere
    it's always public {NameOfClass}
    
    when you have more than one constructor it is called OVERLOADING the constructor
    this gives other users (programmers)fleibility when creating new objects
    the only rule is that each constructor must be different by what data is being sent in
    
    public Student() {
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    //now we can type: Student s = new Student(); in another class
     */
    public Student(String name, int test1, int test2, int test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    /*
        this.  refers to the PROPERTY
        "this" refers to the object itself
        Need to do it this way when the paramters are called the same as the proeprties
        
    }
    
    public Student(Student other){
        this.name = other.getName();
        test1 = other.test1;
        test2 = other.test2;
        test3 = other.test3;
    }
     */
    //when you have multiple constructors you can also CHAIN them
    //Chaining constructors -> calling a constructor from within another constructor
    //saves a bit of time and code

    public Student() {
        //call middle constructor, send in default data:
        this("", 0, 0, 0); //"this" means call the other constructor
    }

    public Student(Student other) {
        //call middle constructor, send all properties of other student into it
        this(other.name, other.test1, other.test2, other.test3);
    }

    /* Step 3 - Other methods / abilities of your object
    3A - Setter methods. Their job is to set a privatae property
    usually void, and always require data to use in setting property
    typically called set{Property}
     */
    public void setName(String n) {
        name = n;
    }

    public void setScore(int i, int score) {
        if (i == 1) {
            test1 = score;
        } else if (i == 2) {
            test2 = score;
        } else {
            test3 = score;
        }
    }

    /*
    3B Getter methods - return the value for a property
    return type is Not void, it matches type of property being returned
    typically called get {Proerty}
     */
    public String getName() {
        return name;
    }

    public int getScore(int i) {
        if (i == 1) {
            return test1;
        } else if (i == 2) {
            return test2;
        } else {
            return test3;
        }
    }

    //3C - Other methods to represent other things the object can do
    public double getAverage() {
        double average; //local variable: NOT a property of students
        average = (test1 + test2 + test3) / 3.0;
        return average;
    }

    public int gethighScore() {
        int high = Math.max(test1, test2);
        high = Math.max(high, test3);
        return high;
    }

    /*3D - toString method
    runs automatically when you print an object
    its job is to print some or all properties at once
    optional (to be continued)
    always public String to String()
     */
    public String toString() {
        String str;
        str = "Name:\t" + name;
        str += "\nTest1:\t" + test1;
        str += "\nTest2:\t" + test2;
        str += "\nTest3:\t" + test3;
        str += "\n----------------";
        str += "\nAverage\t" + getAverage();
        return str;
    }
}

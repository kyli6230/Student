
public class StudentTester {

    public static void main(String[] args) {
        Student x = new Student();
        Student y, z, zz;
        
        y = new Student("Sawyer", 95, 87, 92);
        
        z = new Student(x);//new independent object using x's properties at this time
        zz = x; //another reference to Student x (he now has 2 names)
        //because the NEW word was NOT used, we don't have a new object1
        
        
        x.setName("Vanya");
        x.setScore(1, 71);
        x.setScore(2, 85);
        x.setScore(3, 82);
        
        System.out.println("Hi, my name is " + x.getName());
        System.out.println("My first score is " + x.getScore(1));

        System.out.println("Here are my test scores");
        for (int i = 1; i <= 3; i++) {
            System.out.println(x.getScore(i));
        }

        System.out.println("My average is " + x.getAverage());
        System.out.println("My high score is " + x.gethighScore());

        //run toString of x by just printing x
        System.out.println("\n");
        System.out.println(x);
        System.out.println("\n");
        System.out.println(y);
        System.out.println("\n");
        System.out.println(z);
        System.out.println("\n");
        System.out.println(zz);
        System.out.println("\n");
        
        System.out.println("Change x's mark to 50, 50, 50 using zz reference");
        zz.setScore(1, 50);
        zz.setScore(2, 50);
        zz.setScore(3, 50);
        System.out.println("Here is x's new marks");
        System.out.println(x);
    }

}

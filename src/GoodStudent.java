public class GoodStudent {
    //instance variables
    private String firstName;
    private String lastName;
    private String nickname;
    private boolean csStudent;
    private String id;
    private double gpa;

    //default constructor
    public GoodStudent() {
        firstName = "";
        lastName = "";
        nickname = "";
        csStudent = true;
        id = "";
        gpa = 0;
    } //end default constructor

    //constructor taking in student's first & last name plus nickname
    public GoodStudent(String studentFN, String studentLN, String studentId, double studentGpa, boolean studentCS) {
        firstName = studentFN;
        lastName = studentLN;
        nickname = "";
        csStudent = studentCS;
        id = studentId;
        gpa = studentGpa;
    } //1 string constructor

    //full constructor
    public GoodStudent(String studentFN, String studentLN, String studentNickname, String studentId,
                       double studentGpa, boolean studentCS) {
        firstName = studentFN;
        lastName = studentLN;
        nickname = studentNickname;
        csStudent = studentCS;
        id = studentId;
        gpa = studentGpa;
    } //end full constructor

    //Accessors (getters)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getNickname() { return nickname; }
    public boolean getCsStudent() { return csStudent; }
    public String getId() { return id; }
    public double getGpa() { return gpa; }

    //Mutators (setters)
    public void setNickname(String studentNickname) {nickname = studentNickname;}
    public void setGpa(double studentGpa) {gpa = studentGpa;}

    //Brain Methods!!!
    public String toString() {
        String result = "Student's first name: " + firstName;
        result += "\nStudent's last name: " + lastName +
                    "\nStudent's nickname: " + nickname +
                        "\nIs this person a CS student? " + csStudent +
                            "\nStudent's ID: " + id +
                                "\nStudent's GPA: " + gpa;
        return result;
    }

    public String CreateId() {
        String firstInitial = firstName.substring(0,1);
        String lastThreeId = id.substring(id.length()-3);
        String result = firstInitial + lastName + lastThreeId;
        return result.toLowerCase();
    }

    public double CSGPA() {
        if (csStudent) {
            double newGpa = gpa + (gpa * 0.15);
            return newGpa;
        }
        else {
            return gpa;
        }
    }
}

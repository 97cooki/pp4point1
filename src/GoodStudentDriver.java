
public class GoodStudentDriver {
    public static void main(String[] args) {
        GoodStudent studentAlan = new GoodStudent("Alan", "Turing", "Big Al",
                "191254", 3.56, true);
        GoodStudent studentFlorence = new GoodStudent("Florence", "Nightingale", "182010",
                3.89, false);
        GoodStudent studentGrace = new GoodStudent("Grace", "Hopper", "Queen Bee",
                "190692", 3.99, true);

        System.out.println(studentAlan.toString() + "\n");
        studentFlorence.setNickname("Flo-No");
        studentFlorence.setGpa(3.92);
        System.out.println("Florence's nickname is: " + studentFlorence.getNickname() + "\nFlorence's new GPA is: " +
                studentFlorence.getGpa() + "\n");
        System.out.println("Grace's first name is: " + studentGrace.getFirstName() + "\nIs Grace a CS student? " +
                studentGrace.getCsStudent() + "\n");
        System.out.println("Alan's ID is: " + studentAlan.CreateId() + "\n");
        System.out.println("Grace's ID is: " + studentGrace.CreateId() + "\n");
        System.out.println("Florence's ID is: " + studentFlorence.CreateId() + "\n");
        System.out.println("Alan's GPA will change if he is a CS student. \nIs he a CS student? " +
                studentAlan.getCsStudent() + "\nHis GPA before: " + studentAlan.getGpa() + "\nHis GPA after: "
                + studentAlan.CSGPA() + "\n");
        System.out.println("Florence's GPA will change if she is a CS student. \nIs she a CS student? " +
                studentFlorence.getCsStudent() + "\nHer GPA before: " + studentFlorence.getGpa() + "\nHer GPA after: "
                + studentFlorence.CSGPA() + "\n");
        System.out.println("Grace's GPA will change if he is a CS student. \nIs she a CS student? " +
                studentGrace.getCsStudent() + "\nHer GPA before: " + studentGrace.getGpa() + "\nHer GPA after: "
                + studentGrace.CSGPA());


    }
}
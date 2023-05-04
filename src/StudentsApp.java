import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsApp {

    public static void main(String[] args) {


        List<Student> feStudents = new ArrayList<>();
        feStudents.add(new FrontEndStudent("Alex Novikov", 3.8, false, ""));
        feStudents.add(new FrontEndStudent("Ihor Matveev", 4.7, true, ""));
        feStudents.add(new FrontEndStudent("Anna Schultz", 5.2, false, ""));
        feStudents.add(new FrontEndStudent("Henrich Wecker", 3.4, true, ""));
        feStudents.add(new FrontEndStudent("Helen Schroer", 2.6, true, ""));

        List<Student> beStudents = new ArrayList<>();
        beStudents.add(new BackEndStudent("Rulyov Oleg", 3.4, false, ""));
        beStudents.add(new BackEndStudent("Vladimir Frolov", 3.7, true, ""));
        beStudents.add(new BackEndStudent("Carolina Larz", 5.2, false, ""));
        beStudents.add(new BackEndStudent("Dietrih Scheppers", 4.9, true, ""));
        beStudents.add(new BackEndStudent("Emma Rogova", 4.4, false, ""));

        List<Student> qaStudents = new ArrayList<>();
        qaStudents.add(new QAStudent("John Wolf", 4.8, true, ""));
        qaStudents.add(new QAStudent("Elizabeth Brown", 3.6, true, ""));
        qaStudents.add(new QAStudent("Natalie Krutsch", 5.1, false, ""));
        qaStudents.add(new QAStudent("Julia Fox", 5.4, true, ""));
        qaStudents.add(new QAStudent("Helmut Hefele", 4.7, false, ""));

        List<List<Student>> generalList = new ArrayList<>();
        generalList.add(feStudents);
        generalList.add(beStudents);
        generalList.add(qaStudents);

        System.out.println(generalList);

        System.out.println("\nNew List \n" + generalList.stream().flatMap(oneList -> oneList.stream())
                .filter(r -> r.getRate() > 4.5)
                .filter(t -> t.getFinished() == true)
                .peek(t -> {
                    if (t instanceof BackEndStudent) {
                        t.setType("BE");
                    } else if (t instanceof FrontEndStudent) {
                        t.setType("FE");
                    } else {
                        t.setType("QA");
                    }
                })
                .map(nc -> new ProjectStudent(nc.getName(), nc.getRate(), nc.getType()))
                .collect(Collectors.toList()));
    }
}


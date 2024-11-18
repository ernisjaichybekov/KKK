import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Group group = new Group(1L,"java16");
        group.addStudent(new Germany(1L,"Germany","BMW",
                LocalDate.of(2008,7,22), 6546L));
        group.addStudent(new Germany(2L,"Germany","BMW x5",
                LocalDate.of(2004,7,26),5042L));
        group.addStudent(new Germany(3L,"Germany","BMW x7",
                LocalDate.of(2000,9,2),9999L));

        System.out.println(group);
    }
}
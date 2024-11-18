
 import java.util.Arrays;

public class Group {

    private Long id;
    private String groupName;
    private Germany[]Germanys = new Germany[10];
    private int GermanyCount;

    public Group() {
    }

    public Group(Long id, String groupName,Germany[] Germanys, int GermanyCount) {
        this.id = id;
        this.groupName = groupName;
        this.Germanys = Germanys;
        this.GermanyCount = GermanyCount;
    }

    public Group(Long id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Germany[] getStudents() {
        return Germanys;
    }

    public void setStudents(Germany[] students) {
        this.Germanys = Germanys;
    }

    public int getStudentCount() {
        return GermanyCount;
    }

    public void setStudentCount(int studentCount) {
        this.GermanyCount = studentCount;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + "\n" +
                ", students=" + Arrays.toString(Germanys) +"\n" +
                ", studentCount=" + GermanyCount +
                '}';
    }


    // TODO creat


    public void addStudent(Germany student) {
        this.Germanys[GermanyCount++] = student;
        System.out.println("success !");
    }

    public void getAllStudent() {
        for (int i = 0; i < GermanyCount; i++) {
            System.out.printf("""
                             Long id : %s
                             String lastName: %s
                             String firstName: %s
                             LocalDate age: %s
                             String gender: %s
                             phoneNumber : %s
                            """, Germanys[i].getId(), Germanys[i].getLastName(), Germanys[i].getFirstName(),
                    Germanys[i].getAge(), Germanys[i].getGender(), Germanys[i].getPhoneNumber());
        }
    }

    public void getStudentById(Long studentId) {
        boolean islaik = false;
        for (int i = 0; i < GermanyCount; i++) {
            if (Germanys[i].getId().equals(studentId)) {
                islaik = true;
                System.out.printf("""
                         Long id : %s
                         String lastName: %s
                         String firstName: %s
                         LocalDate age: %s
                         String gender: %s
                         phoneNumber : %s
                        """,Germanys[i].getId(),Germanys[i].getLastName(),Germanys[i].getFirstName(),
                        Germanys[i].getAge(),Germanys[i].getGender(),Germanys[i].getPhoneNumber());
            }
        }

        if (!islaik){
            System.out.println("Student with id "+ studentId + " not found !");
        }
    }

    public void deleteStudent(Long studentId) {
        boolean islaik = false;

        for (int i = 0; i < GermanyCount; i++) {

            if(Germanys[i].getId().equals(studentId)){
                islaik = true;
                for (int v = i; v < GermanyCount; v++ ) {
                    Germanys   [v] = Germanys[v + 1];




                }
                GermanyCount -- ;
                System.out.println("deleted !!  ");
            }
        }

        if (!islaik){
            System.out.println( " student with  id  "+ studentId + " not found !");
        }
    }

    public void updateStudent(Long studentId, Germany newStudent) {
        boolean islaik = false;

        for (int i = 0; i < GermanyCount; i++) {
            if (Germanys[i].getId().equals(studentId)){
                islaik = true;
                Germanys[i] = newStudent;
            }
        }
        if (!islaik){
            System.out.println("Student with id "+ studentId + " not found !");
        }


    }

}

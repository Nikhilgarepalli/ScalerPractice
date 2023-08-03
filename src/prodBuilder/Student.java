package prodBuilder;

public class Student {
    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;

    Student(StudentBuilder b) {
        if (b.age > 100) {
            throw new IllegalArgumentException("Age cant be greater then 70");
        }
        this.name = b.getName();
        this.age = b.getAge();
        this.gender = b.getGender();
        this.universityName=b.getUniversityName();
        this.gradYear=b.getGradYear();
        this.cgpa= b.getCgpa();
        this.address=b.getAddress();
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder {

       String name;
         int age;
         String gender;
         String universityName;
        String gradYear;
         double cgpa;
         String address;

        private StudentBuilder()
        {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getGradYear() {
            return gradYear;
        }

        public void setGradYear(String gradYear) {
            this.gradYear = gradYear;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }



    }

}

package BuilderPattern;

public class Student {
        String name;
        int age;
        String gender;
        String universityName;
        String gradYear;
        double cgpa;
        String address;

        public Student(Helper helper)
        {
            if(helper.age>100)
            {
                throw new IllegalArgumentException("Age cant be greater then 70");
            }
            this.name = helper.name;
            this.age = helper.age;
        }
}

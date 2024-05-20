package java_inheritance_polymorphism.no2;

public class UjiKelas {
    public static void main(String[] args) {
        MyDate tanggalDipekerjakan = new MyDate(2022, 9, 1);
        
        Person person = new Person("Susanti", "Lembang", "0829-172", "susan@imail.com");
        Student student = new Student("Teri Ella", "Asrama Bumi Siliwangi Blok D", "0821-839", "teriella@imail.com", Student.Junior);
        Employee employee = new Employee("Salua Qinan", "Parongpong", "0819-283", "saluaq@imail.com", "Gedung Rektorat Lt. 3", 6000000, tanggalDipekerjakan);
        Faculty faculty = new Faculty("Nady Wijaya", "Pagerwangi", "0853-7282", "naw1jay@imail.com", "Gedung JICA Lt. 2", 5200000, tanggalDipekerjakan, 10, "Professor");
        Staff staff = new Staff("Deras Buana", "Bandung City, No. 2", "0821-2102", "deras.bwana@imail.com", "Ruang Administrasi FPMIPA", 4000000, tanggalDipekerjakan, "Manager");
        
        System.out.println(person.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(student.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(employee.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(staff.toString());
        System.out.println("=========================================");
        System.out.println();
    }
}


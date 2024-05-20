package java_inheritance_polymorphism.no2;

public class Student extends Person {
    public static final String TahunPertama= "Tahun Pertama";
    public static final String TahunKedua = "Tahun Kedua";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";

    private String status;
    
    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Class: Student \nNama: " + getNama() + "\nAlamat: " + getAlamat() + "\nNo Telepon: "
                + getNomorTelepon() + "\nEmail: " + getEmail() + "\nStatus: " + status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}


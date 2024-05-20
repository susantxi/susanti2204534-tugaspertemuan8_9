package java_inheritance_polymorphism.no2;

public class Person {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Class: Person \nNama: " + nama + "\nAlamat: " + alamat + "\nNo Telepon: " + nomorTelepon + "\nEmail: " + email;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

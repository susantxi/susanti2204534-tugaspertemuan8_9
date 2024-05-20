package java_inheritance_polymorphism.no2;

public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Class: Employee \nNama: " + getNama() + "\nAlamat: " + getAlamat() 
                + "\nNo Telepon: " + getNomorTelepon() + "\nEmail: " + getEmail()
                + "\nKantor: " + kantor + "\nGaji: " + gaji + "\nTanggal DIpekerjakan: " + tanggalDipekerjakan;
    }
    
    public String getKantor() {
        return kantor;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public MyDate getTanggalDipekerjakan() {
        return tanggalDipekerjakan;
    }
    
    public void setKantor(String kantor) {
        this.kantor = kantor;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void setTanggalDipekerjakan(MyDate tanggalDipekerjakan) {
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }
}

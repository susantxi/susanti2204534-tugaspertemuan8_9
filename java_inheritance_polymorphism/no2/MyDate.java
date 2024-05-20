/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_inheritance_polymorphism.no2;

public class MyDate {
    private int tahun;
    private int bulan;
    private int tanggal;

    public MyDate(int tahun, int bulan, int tanggal) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return tahun + "-" + bulan + "-" + tanggal;
    }
    
}

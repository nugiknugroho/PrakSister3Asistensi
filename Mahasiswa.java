/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasAsistensi;

import java.io.Serializable;

public class Mahasiswa implements Serializable{
    private final String NIM;
    private final String Nama;
    private final String Alamat;
    private final String Kelas;

    public Mahasiswa(String NIM, String Nama, String Alamat, String Kelas){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Kelas = Kelas;
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getAlamat(){
        return Alamat;
    }

    public String getKelas(){
        return Kelas;
    }

    @Override
    public String toString(){
        return NIM + " - " + Nama + ". " + Alamat + ". Kelas " + Kelas;
    }
}

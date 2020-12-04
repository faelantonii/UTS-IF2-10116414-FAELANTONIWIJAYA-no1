/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_IF2_10116414_FAELANTONIWIJAYA_no1;

/**
 *
 * @author sweenutt
 */
public class Age {
    private int YearBirth;
    private int YearNow;
    private String keterangan;
    
    public Age(int YearNow) {
        this.YearNow = YearNow;
    }
    public int getYearBirth() {
        return YearBirth;
    }
    public void setYearBirth(int YearBirth) {
        this.YearBirth = YearBirth;
    }
    public int getYearNow() {
        return YearNow;
    }
    public int hitungUmur() {
        return YearNow - YearBirth;
    }
    public String tandanyaKamu(int umur) {
        if(umur >= 0 && umur <= 5) {
            this.keterangan = "LAGI LUCU-LUCUNYA";
            return keterangan;
        } else if(umur > 5 && umur <= 10) {
            this.keterangan = "MASIH ANAK-ANAK";
            return keterangan;
        } else if(umur > 10 && umur <= 13) {
            this.keterangan = "MASIH REMAJA";
            return keterangan;
        } else if(umur > 13 && umur <= 19) {
            this.keterangan = "ALAY";
            return keterangan;
        } else if(umur > 19 && umur <= 29) {
            this.keterangan = "LAGI GALAU NYARI JODOH";
            return keterangan;
        } else if(umur > 29 && umur <= 35) {
            this.keterangan = "LAGI SIBUK NYARI UANG";
            return keterangan;
        } else if(umur > 35 && umur <= 150) {
            this.keterangan = "SUDAH TUA";
            return keterangan;
        } else {
            this.keterangan = "TIDAK TERDETEKSI DI KEHIDUPAN";
            return keterangan;
        }
    }
}

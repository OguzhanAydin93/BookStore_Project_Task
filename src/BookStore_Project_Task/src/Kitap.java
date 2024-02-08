package BookStore_Project_Task.src;

class Kitap {
    int kitapNo;
    int yayinYili;
    String kitapAdi;
    String yazarAdi;
    double fiyat;
    static int sayac = 0;

    public Kitap(String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
        this.kitapNo = ++sayac;
        this.kitapAdi = kitapAdi;
        this.fiyat = fiyat;
        this.yayinYili = yayinYili;
        this.yazarAdi = yazarAdi;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        Kitap.sayac = sayac;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }


    @Override
    public String toString() {
        return "\n"+ "Kitap numarası: " + kitapNo + "\n"+
                "Yayın yılı: " + yayinYili + "\n"+
                "Kitap adı: " + kitapAdi + "\n"+
                "Yazar adı: " + yazarAdi + "\n"+
                "Fiyatı: " + fiyat +" " +"\n";
    }
}







public class CekNilai {
    int nilai;  

    public CekNilai(int nilai) {
        this.nilai = nilai;
    }

    public String cekLulus() {
        if (nilai >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public String cekGrade() {
        if (nilai >= 85) {
            return "Grade: A";
        } else if (nilai >= 70) {
            return "Grade: B";
        } else if (nilai >= 60) {
            return "Grade: C";
        } else if (nilai >= 50) {
            return "Grade: D";
        } else {
            return "Grade: E";
        }
    }
}
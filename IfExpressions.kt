fun main() {
    val NilaiDiatasKkm = 80
    val NilaiDibawahKkm = 70
    val nilai: String
    nilai = if (NilaiDibawahKkm > 70) {
        "Selamat ya! "
    } else if (NilaiDibawahKkm > NilaiDiatasKkm) {
        "Nilai kamu 80, selamat ya!"
    } else {
        "Nilai kamu 70, silahkan ikuti remidial"
    }
    print(nilai)
}
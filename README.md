Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh aplikasi sederhana untuk mengelola data hewan di taman satwa menggunakan bahasa pemrograman **Java**, sebagai tugas akhir dari mata kuliah **Pemrograman Berbasis Objek 1 (PBO 1)**.


Deskripsi

Aplikasi ini memungkinkan petugas taman satwa untuk:

* Menambahkan hewan (misalnya: singa, gajah)
* Memberi makan hewan sesuai jenis makanan
* Memeriksa kondisi kesehatan hewan
* Menampilkan suara hewan
* Menampilkan daftar hewan dalam kandang

Aplikasi ini dirancang dengan pendekatan Object-Oriented Programming (OOP) dan mencakup semua konsep dasar OOP seperti Class, Object, Encapsulation, Inheritance, Polymorphism, serta fitur pemrograman lainnya seperti seleksi, perulangan, array, I/O sederhana, dan error handling.

---

🧠 Konsep PBO yang Diimplementasikan

1. Class

Semua entitas utama seperti `Hewan`, `Singa`, `Gajah`, `Petugas`, `Kandang`, dan `TamanSatwa` dibuat sebagai class.

```java
public class Petugas { ... }
public class Kandang { ... }
public class TamanSatwa { ... }
```

2. Object

Objek dibuat dari class, seperti:

```java
Petugas petugas = new Petugas("Budi");
Singa leo = new Singa("Leo", 5);
```

3. Atribut

Contohnya pada class `Hewan`, memiliki atribut:

```java
private String nama;
private int usia;
private String jenisMakanan;
private String kesehatan;
```

4. Constructor

Untuk menginisialisasi object saat dibuat:

```java
public Hewan(String nama, int usia, String jenisMakanan) { ... }
```

5. Mutator (Setter)

Digunakan untuk mengubah nilai atribut:

```java
public void setKesehatan(String kesehatan) { ... }
```

6. Accessor (Getter)

Digunakan untuk mengambil nilai atribut:

```java
public String getNama() { ... }
public String getKesehatan() { ... }
```

7. Encapsulation

Atribut disembunyikan dengan modifier `private`, dan hanya dapat diakses melalui getter/setter:

```java
private String nama; // hanya dapat diakses lewat getNama()
```

8. Inheritance

Class `Singa` dan `Gajah` mewarisi `Hewan`:

```java
public class Singa extends Hewan { ... }
```

9. Polymorphism

Method `suara()` di-override oleh masing-masing subclass:

```java
@Override
public void suara() {
    System.out.println(getNama() + " mengaum: ROAAARR!");
}
```

10. Seleksi (Percabangan)

Untuk menentukan apakah makanan cocok:

```java
if (makanan.equalsIgnoreCase(hewan.getJenisMakanan())) { ... }
```

11. Perulangan

Menampilkan daftar semua hewan menggunakan perulangan:

```java
for (Hewan h : daftarHewan) {
    System.out.println(h.getNama());
}
```

12. Input Output Sederhana

Menggunakan `Scanner` dan `System.out.println`:

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukkan makanan: ");
```

13. Array / ArrayList

Mengelola koleksi objek `Hewan`:

```java
ArrayList<Hewan> daftarHewan = new ArrayList<>();
```

14. Error Handling

Menangani kesalahan input:

```java
try {
    // aksi
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

---

🎮 Cara Menjalankan Program

1. Buka NetBeans.
2. Buat project Java dan simpan seluruh file `.java` ke dalam folder `src/uaspbo1/`.
3. Jalankan file `TamanSatwa.java` sebagai file utama (main class).
4. Ikuti instruksi di console untuk input makanan dan melihat respon dari program.

# Java-Dasar
## For Loop
* `For` adalah salah satu kata kunci yang bisa **digunakan untuk melakukan** `perulangan`.
* **Block kode yang terdapat di dalam `for` akan selalu diulangi selama kondisi `for` terpenuhi**.

---

## Sintak Perulangan For
```java
for(init statement; kondisi; post statement){
    // block perulangan
}
```
* `Init Statement` akan **dieksekusi** hanya sekali di awal **sebelum perulangan**.
* `Kondisi` akan dilakukan pengecekan dalam setiap perulangan, jika `true` **perulangan akan dilakukan**, jika `false` **perulangan akan berhenti**.
* `Post Statement` akan **dieksekusi** setiap kali **diakhir perulangan**.
* `Init Statement`, `Kondisi` dan `Post Statement` tidak wajib diisi, jika `Kondisi` tidak diisi, berarti `Kondisi` selalu bernilai `true`.
# Java-Dasar
## Recursive Method
* `Recursive Method` adalah kemampuan `method` memanggil `method` dirinya sendiri.
* Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan `recursive method`, seperti contohnya **kasus factorial**.

---

## Problem Dengan Recursive
* Walaupun `recursive method`itu sangat menarik, namun kita perlu berhati-hati.
* **Jika `recursive` terlalu dalam**, maka akan ada **kemungkinan** **terjadi** error `StackOverFlow`, yaitu error dimana **stack** `method` terlalu banyak di **Java**.
* **Kenapa** problem ini **bisa terjadi**? **Karena** ketika kita memanggil `method`, **Java** akan menyimpannya dalam sebuah **stack**, jika `method` tersebut memanggil `method` lain, maka **stack** akan menumpuk terus, dan jika terlalu dalam, maka **stack** akan terlalu besar, dan bisa menyebabkan error `StackOverFlow`.
* Untuk Error nya sendiri tergantung pada Memory yang ada di dalam laptop masing-masing, jika memory nya lebih besar, maka kemungkinan method yang dipanggil dapat lebih banyak, Jika tidak maka sebaliknya.

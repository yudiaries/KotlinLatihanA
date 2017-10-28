fun main(args: Array<String>) {
    var map= hashMapOf("Nama depan" to " Yudi", "Nama Tengah" to "Aries")
    map.put("Nama Belakang","Wandi")
    println(map.get("Nama Belakang"))
            println(map["Nama Belakang"])

            var ar=arrayOf(1,10,22,11)
    println(ar[0])
    var list = mutableListOf(11,22,33,22)
    list[0]=22
    for (item in list){
        println(item)
    }
}
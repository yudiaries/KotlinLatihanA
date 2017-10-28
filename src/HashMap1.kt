fun main(args: Array<String>) {
    var map=HashMap<String,String>()
    map.put("Nama depan","Yudi")
    map.put("Nama Tengah","Aries")
    map.put("Nama Belakang","Wandi")
    println(map.get("Nama depan"))

    map.put("Nama Tengah","Unisnu Jepara")
    for (k in map.keys){
        println(k+" "+map.get(k))
    }
}
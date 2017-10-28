fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"Yudi")
    map.put(2,"Aries")
    map.put(33,"Wandi")
    println(map.get(33))

    map.put(33,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }

}
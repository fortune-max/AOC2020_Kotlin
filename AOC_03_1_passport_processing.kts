fun Boolean.toInt() = if (this) 1 else 0;
var count = 0; var txt: String = "";

(1..288).forEach{ _ ->
    val fields = mutableMapOf<String, String>()
    while (true) {
        txt = readln()
        if (txt.trim().isEmpty()) break
        txt.split(" ").forEach{
            val (key, value) = it.split(":")
            fields[key] = value
        }
    }

    count += listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid").all{
        fields.getOrDefault(it, "dirt") != "dirt"
    }.toInt()
}

println(count)
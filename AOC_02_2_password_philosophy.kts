fun Boolean.toInt() = if (this) 1 else 0
var counter = 0

(1..1000).forEach{ _ ->
    val in_txt = readln().split(' ')
    val positions = in_txt[0].split('-').map{it.toInt() - 1}
    val (my_char, password) = listOf(in_txt[1][0], in_txt[2])
    if (password is String && my_char is Char) {
        val ct = (password[positions[0]] == my_char).toInt() + (password[positions[1]] == my_char).toInt()
        counter += if (ct == 1) 1 else 0
    }
}

println(counter)

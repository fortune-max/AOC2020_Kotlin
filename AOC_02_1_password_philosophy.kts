var counter = 0

(1..1000).forEach{ _ ->
    val in_txt = readln().split(' ')
    val limits = in_txt[0].split('-').map{it.toInt()}
    val my_char = in_txt[1][0]
    val password = in_txt[2]
    val freq = password.count{it==my_char}
    counter += if (limits[0] <= freq && freq <= limits[1]) 1 else 0
}

println(counter)
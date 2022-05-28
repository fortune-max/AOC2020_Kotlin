val numbers: MutableList<Int> = mutableListOf()
(1..200).forEach{ _ ->
    numbers.add(Integer.parseInt(readln()))
}

for(i in numbers.indices)
    for (j in i+1 until numbers.size)
        for (k in j+1 until numbers.size)
            if (numbers[i] + numbers[j] + numbers[k] == 2020)
                println(numbers[i] * numbers[j] * numbers[k])

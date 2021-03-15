package com.cbellmont.ejemplodescargainternet

data class Persoanjesstarswars(
    var name: String,
    var birth_year: String,
    var mass: String,
    var hair_color: String,
    val species: List<String>){



    override fun toString(): String {
        return " $name\n Y su especie  es $species\n  Su edad es $birth_year\n Su peso es $mass\n Su color de pelo es $hair_color\n"

    }
}


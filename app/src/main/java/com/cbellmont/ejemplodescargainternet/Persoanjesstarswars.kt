package com.cbellmont.ejemplodescargainternet

import com.google.gson.annotations.SerializedName

data class Persoanjesstarswars(
    var name: String,
    val species: List<String>){



    override fun toString(): String {
        return " $name\n Y su especie  es $species\n\n"
    }
}


package com.cbellmont.ejemplodescargainternet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.cbellmont.ejemplodescargainternet.databinding.ActivityMainBinding
import kotlinx.coroutines.*

interface MainActivityInterface {
    suspend fun onFilmsReceived(listPersoanjesstarswars : List<Persoanjesstarswars>)
}

class MainActivity : AppCompatActivity(), MainActivityInterface {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch(Dispatchers.IO){
            GetAllPersonajes.send(this@MainActivity)
        }
    }

    override suspend fun onFilmsReceived(listPersoanjesstarswars : List<Persoanjesstarswars>) {
        withContext(Dispatchers.Main){
            binding.personajes.text = ""
            listPersoanjesstarswars.forEach {
                binding.personajes.append(it.toString())
            }
        }

    }
}
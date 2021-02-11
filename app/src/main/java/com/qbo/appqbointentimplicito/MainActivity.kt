package com.qbo.appqbointentimplicito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qbo.appqbointentimplicito.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_main)

        binding.btncompartir.setOnClickListener {
            // Create the text message with a string
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Hola Mundo")
                type = "text/plain"
            }
            // Verify that the intent will resolve to an activity
            if (sendIntent.resolveActivity(packageManager) != null) {
                startActivity(sendIntent)
            }

        }

    }
}
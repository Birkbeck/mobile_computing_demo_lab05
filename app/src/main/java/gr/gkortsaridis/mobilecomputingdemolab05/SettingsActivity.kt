package gr.gkortsaridis.mobilecomputingdemolab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gr.gkortsaridis.mobilecomputingdemolab05.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
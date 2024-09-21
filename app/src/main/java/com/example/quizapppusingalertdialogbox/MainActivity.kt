package com.example.quizapppusingalertdialogbox

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapppusingalertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btn1.setOnClickListener {
            val options =  arrayOf("java" , "Python" , "R" , "Kotlin")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What is Your Favourite Language")
            builder1.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->

            })
            builder1.setPositiveButton("submit", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.setNegativeButton("Back", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val options =  arrayOf("java" , "Python" , "R" , "Kotlin")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is Your Favourite Language")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->

            })
            builder2.setPositiveButton("submit", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.setNegativeButton("Back", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val options =  arrayOf("java" , "Python" , "R" , "Kotlin")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("What is Your Favourite Language")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->

            })
            builder3.setPositiveButton("submit", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder3.setNegativeButton("Back", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder3.show()
        }

        binding.btn4.setOnClickListener {
            val options =  arrayOf("java" , "Python" , "R" , "Kotlin")
            val builder4 = AlertDialog.Builder(this)
            builder4.setTitle("What is Your Favourite Language")
            builder4.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->

            })
            builder4.setPositiveButton("submit", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder4.setNegativeButton("Back", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder4.show()
        }

        binding.btn5.setOnClickListener {
            val options =  arrayOf("java" , "Python" , "R" , "Kotlin")
            val builder5 = AlertDialog.Builder(this)
            builder5.setTitle("What is Your Favourite Language")
            builder5.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->

            })
            builder5.setPositiveButton("submit", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder5.setNegativeButton("Back", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder5.show()
        }

        binding.btnSubmit.setOnClickListener {
            Toast.makeText(this , "The all will be Submitted " , Toast.LENGTH_SHORT).show()
        }
    }
}
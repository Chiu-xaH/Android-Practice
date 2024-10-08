package com.example.alertdialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.alertdialog.ui.theme.AlertDialogTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            val a = AlertDialog.Builder(this)
            a.setTitle("标题")
            a.setMessage("看我")
            a.setPositiveButton("确定") { dialog, which ->
                Toast.makeText(this,"确定",Toast.LENGTH_SHORT).show()
            }
            a.show()
        }
                }
            }


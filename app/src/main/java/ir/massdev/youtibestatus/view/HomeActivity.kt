package ir.massdev.youtibestatus.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.massdev.youtibestatus.R


class HomeActivity : AppCompatActivity() {

    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //
        toolbar = findViewById(R.id.too_bar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = ""

/*        val w: Window = window
        w.setTitle("My title")*/

    }
}
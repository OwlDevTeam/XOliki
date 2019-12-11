package com.example.xoliki



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View







class AboutActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

            }





 open fun Start (x:View){


         when (x.id) {
         R.id.Start1 -> {
             val sendP = Intent(this, MainActivity::class.java)
             sendP.putExtra("IIon", 0)
             startActivity(sendP)
         }
         R.id.Start2 -> {
 val sendP = Intent(this, MainActivity::class.java)
             sendP.putExtra("IIon", 1)
  startActivity(sendP)
}
  R.id.Exit-> {
  moveTaskToBack(true);

}

}

}

}




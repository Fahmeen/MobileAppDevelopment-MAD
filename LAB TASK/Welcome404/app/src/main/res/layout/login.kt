package fahmeen.lab.welcome404
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val email = findViewById(R.id.email) as EditText
        val pass = findViewById(R.id.pass) as EditText

        val btnLogin = findViewById(R.id.login) as Button
        btnLogin.setOnClickListener {
            //read value from EditText to a String variable
            val ema: String = email.text.toString()
            val pas: String = pass.text.toString()
//check if the EditText have values or not
            if (ema.trim().length == 0) {
                Toast.makeText(applicationContext, "Email field cannot be empty", Toast.LENGTH_SHORT).show()
            }
            if (pas.trim().length == 0) {
                Toast.makeText(applicationContext, "Password field cannot be empty", Toast.LENGTH_SHORT).show()
            }

            if (ema.equals("abc@xyz.com")&&(pas.equals("123456"))){
                val intent = Intent(this, home::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(applicationContext, "Wrong Email or Password!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
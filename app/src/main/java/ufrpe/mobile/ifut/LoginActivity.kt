package ufrpe.mobile.ifut

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signInBtn.setOnClickListener {
            if (loginText.text.toString().equals("admin")) {
                if (passwordText.text.toString().equals("admin")) {

                }
                loginMessage.text = getString(R.string.wrongPass)
                loginMessage.visibility = View.VISIBLE
            } else {
                loginMessage.text = getString(R.string.loginNotFound)
                loginMessage.visibility = View.VISIBLE
            }
        }
    }
}

package imcCalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.newkotlin.R

class imcActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc)
        initComponents()
        initUI()

    }

    private fun changeGender(){

        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun initUI() {
        setGenderColor()
    }

    private fun initComponents() {

        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)

    }

    private fun initListeners() {

        viewMale.setOnClickListener { setGenderColor() }
        viewFemale.setOnClickListener { setGenderColor() }

    }

    private fun setGenderColor(){

        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {



        val coloreReference = if (isSelectedComponent) {

            R.color.background_component_selected
        } else {
            R.color.background_component

        }


        return ContextCompat.getColor(this, coloreReference)


    }

}

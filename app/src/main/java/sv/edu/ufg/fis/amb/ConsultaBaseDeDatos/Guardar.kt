package sv.edu.ufg.fis.amb.ConsultaBaseDeDatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sv.edu.ufg.fis.amb.ConsultaBaseDeDatos.databinding.ActivityGuardarBinding

class Guardar : AppCompatActivity() {

    private lateinit var binding: ActivityGuardarBinding
    private lateinit var db: BaseDeDatos


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuardarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = BaseDeDatos(this)
        binding.btnGuardar.setOnClickListener{
            val mensaje = binding.txtData.text.toString()
            val registro = Registro(mensaje)
            db.insertarMensaje(registro)
            finish()
            Toast.makeText(this, "Mensaje guardado", Toast.LENGTH_LONG).show()
        }
    }
}
package com.L20290998.myfirstapplication.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.L20290998.myfirstapplication.R;
import com.L20290998.myfirstapplication.usuario.model.Usuario;
import com.L20290998.myfirstapplication.usuario.repository.UsuarioRepository;

public class DashBoardUsuario extends AppCompatActivity {
    private UsuarioRepository ur;
    private Usuario userInfo;

    private TextView tvEdad;

    private EditText etUsua,etNumber,etContra,etNombre,etCorreo,etEda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_usuario);
        //Aqui creamos la instancia del usuario repository
        ur = UsuarioRepository.getInstance();
        //Esta es la manera en que recibimos info de otro activiti
        String usuario =getIntent().getStringExtra("Usuario");
        String pass =getIntent().getStringExtra("pass");

        //Obtenemos info de el usuario logeado
        userInfo = ur.getRegisteredUsers().get(usuario).get(pass);
        /*Usuario O = new Usuario;






        O.getNombre();
*/
        etUsua = findViewById(R.id.etUsua);

        etUsua.setText(userInfo.getUsuario());

        etContra = findViewById(R.id.etContra);

        etContra.setText(userInfo.getPass());

        etNombre = findViewById(R.id.etNombre);

        etNombre.setText(userInfo.getNombre());

        etEda = findViewById(R.id.etEda);

        etEda.setText(userInfo.getEdad()+ "" .concat(getString((R.string.etEda))));

        etCorreo = findViewById(R.id.etCorreo);

        etCorreo.setText(userInfo.getEmail());



        etCorreo = findViewById(R.id.etCorreo);

        etCorreo.setText(userInfo.getEmail());

        //int resultado = Integer.parseInt(userInfo.getEdad().toString());
        //Integer.parseInt(et_PrimerNumeroHint.getText().toString())
        /*
        int etNumber = getEdad();*/
/*
        int operacion = Integer.parseInt(etNumber.getEdad().toString());

        etNumber = findViewById(R.id.etNumber);

        etNumber.setText(userInfo.getEdad());*/

    }
}
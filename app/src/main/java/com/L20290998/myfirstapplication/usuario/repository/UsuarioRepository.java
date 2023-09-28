package com.L20290998.myfirstapplication.usuario.repository;

import com.L20290998.myfirstapplication.usuario.model.Usuario;

import java.util.HashMap;

public class UsuarioRepository {
    private static UsuarioRepository repository = null;

    private HashMap<String,HashMap<String, Usuario>> registeredUsers;
    private UsuarioRepository(){
        Usuario u1 = new Usuario("Luis","perro","Luis",28,
        "miguel.miguelmendoza");

        Usuario u2 = new Usuario("Pedro","123","Pedro",24,"hb888");

        Usuario u3 = new Usuario("Ana","555","Ana",666,"anaarroba");

        this.registeredUsers = new HashMap<String,HashMap<String,Usuario> >();

        registeredUsers.put(u1.getUsuario(), new HashMap<String,Usuario>());
        registeredUsers.get(u1.getUsuario()).put(u1.getPass(),u1);


        registeredUsers.put(u2.getUsuario(), new HashMap<String,Usuario>());
        registeredUsers.get(u2.getUsuario()).put(u2.getPass(),u2);

        registeredUsers.put(u3.getUsuario(), new HashMap<String,Usuario>());
        registeredUsers.get(u3.getUsuario()).put(u3.getPass(),u3);

        //Copiarlo 3 veces con cada usuario


    };

    public static UsuarioRepository getInstance() {
        if (repository == null)
            repository = new UsuarioRepository();
        return repository;
    }

    public HashMap<String, HashMap<String, Usuario>> getRegisteredUsers() {
        return registeredUsers;
    }
}

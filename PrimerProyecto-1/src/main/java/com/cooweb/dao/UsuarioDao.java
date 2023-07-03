package com.cooweb.dao;

import java.util.List;

import com.coowed.models.Usuario;

import jakarta.transaction.Transactional;
@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuarios();

}

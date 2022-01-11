package br.com.verzel.apicarros.services.impl;

import br.com.verzel.apicarros.entities.Usuario;
import br.com.verzel.apicarros.repositories.UsuarioRepository;
import br.com.verzel.apicarros.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    @Override
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

}

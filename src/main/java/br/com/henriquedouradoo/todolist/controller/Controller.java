package br.com.henriquedouradoo.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//ROTAS
@RequestMapping("/TestRota")

public class Controller {

    /*
    Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/Informação
     * PUT - Alterar um dado/Informação
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */

     // método (Funcionalidade) de uma classe 
    @GetMapping("/")
    public String TestClasse() {
        return "Funcionou";
    } 
}

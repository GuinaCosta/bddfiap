package bddfiap;

class Autenticacao {

    static String logarUsuario(String login, String senha) {
        if (login.equals("usuario") & senha.equals("senha") ) {
            // Usuario autenticado
            return "Usuario autenticado";
        } else {
            // Visitante
            return "Visitante";
        }
    }
}
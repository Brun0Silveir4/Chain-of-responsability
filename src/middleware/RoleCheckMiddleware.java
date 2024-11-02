package middleware;

// A classe RoleCheckMiddleware verifica se o usuário tem privilégios de administrador, exibindo uma saudação
// específica para administradores e outra para usuários comuns antes de prosseguir na cadeia de autenticação.

public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
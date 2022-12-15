package freire.ermeson.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("clinicaP");
    }
    public static EntityManager conexao(){
        return emf.createEntityManager();
    }
    public static void fechaConexao(){
        emf.close();
    }

}

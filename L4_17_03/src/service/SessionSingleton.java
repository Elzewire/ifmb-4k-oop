package service;

import model.entities.Session;

public class SessionSingleton {

    private static Session session;

    public static Session getSession() {
        if (session != null) {
            return session;
        }
        return new Session();
    }

}

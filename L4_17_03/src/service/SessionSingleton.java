package service;

import model.entities.Session;

public class SessionSingleton {

    private static Session session;

    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

}

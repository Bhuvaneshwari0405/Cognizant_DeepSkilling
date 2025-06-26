package com.example;

public class SessionManager {
    private final UserSession session;

    public SessionManager(UserSession session) {
        this.session = session;
    }

    public void runSession() {
        session.login();
        session.fetchData();
        session.logout();
    }
}

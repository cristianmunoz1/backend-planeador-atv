package com.proyIntUdeA.proyectoIntegradorI.service;

import com.proyIntUdeA.proyectoIntegradorI.model.Session;
import java.util.List;

public interface SessionService {
    Session saveSession(Session session);

    List<Session> getAllSessions();

    Session getSessionById(long id);

    boolean deleteSession(long id);

    Session updateSession(long id, Session session);
}

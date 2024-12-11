package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

import org.keycloak.Config;

public class AdminEventListenerProviderFactory implements EventListenerProviderFactory {

    public EventListenerProvider create(KeycloakSession session){
        return new AdminEventListenerProvider();
    }

    public void init(Config.Scope config){
    }

    public void postInit(KeycloakSessionFactory factory){ }

    public void close(){ }

    public String getId(){
        return "keycloak-admin-events-logger";
    }

}
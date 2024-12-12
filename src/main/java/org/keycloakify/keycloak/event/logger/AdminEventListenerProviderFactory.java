
package org.keycloakify.keycloak.event.logger;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class AdminEventListenerProviderFactory implements EventListenerProviderFactory {

    public static final String ID = "keycloakify-logging";

    @Override
    public AdminEventListenerProvider create(KeycloakSession session) {
        return new AdminEventListenerProvider();
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

    @Override
    public void close() {
    }

    @Override
    public String getId() {
        return ID;
    }

}

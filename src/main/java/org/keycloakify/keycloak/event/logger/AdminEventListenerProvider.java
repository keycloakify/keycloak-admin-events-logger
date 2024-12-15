package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class AdminEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) { }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean includeRepresentation) {
        System.out.println("keycloakify-logging: REALM_CONFIG_CHANGED");
    }

    @Override
    public void close() {
    }

}

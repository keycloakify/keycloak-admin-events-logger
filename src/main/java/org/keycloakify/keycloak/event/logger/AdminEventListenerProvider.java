package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class AdminEventListenerProvider implements EventListenerProvider {

    public void close() {
    }

    public void onEvent(Event event) {
    }

    public void onEvent(AdminEvent event, boolean includeRepresentation) {
        System.out.println("UPDATE: " + event.getOperationType().toString());
    }
}
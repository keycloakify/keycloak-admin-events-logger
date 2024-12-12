package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class AdminEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) {
        System.out.println("!========================> onEvent(Event event)");
    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean includeRepresentation) {
        System.out.println("!========================> onEvent(AdminEvent adminEvent, boolean includeRepresentation)");
    }

    @Override
    public void close() {
        System.out.println("!========================> close()");
    }


}

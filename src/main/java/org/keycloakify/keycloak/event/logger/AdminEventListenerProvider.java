package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;
import java.util.Map;

public class AdminEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) {
        StringBuilder sb = new StringBuilder();

        sb.append("!!!!!!!!!!!!!!!!!!!!!!!!!! type=");
        sb.append(event.getType().toString());
        sb.append(", realmId=");
        sb.append(event.getRealmId());
        sb.append(", realmName=");
        sb.append(event.getRealmName());
        sb.append(", clientId=");
        sb.append(event.getClientId());
        sb.append(", userId=");
        sb.append(event.getUserId());
        if (event.getSessionId() != null) {
            sb.append(", sessionId=");
            sb.append(event.getSessionId());
        }
        sb.append(", ipAddress=");
        sb.append(event.getIpAddress());

        if (event.getError() != null) {
            sb.append(", error=");
            sb.append(event.getError());
        }

        if (event.getDetails() != null) {
            for (Map.Entry<String, String> e : event.getDetails().entrySet()) {
                sb.append(", ");
                sb.append(e.getKey());
                sb.append("=");
                sb.append(e.getValue());
            }
        }

        System.out.println(sb.toString());

    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean includeRepresentation) {

        StringBuilder sb = new StringBuilder();

        sb.append("!!!!!!!!!!!!!!!!!! operationType=");
        sb.append(adminEvent.getOperationType().toString());
        sb.append(", realmId=");
        sb.append(adminEvent.getAuthDetails().getRealmId());
        sb.append(", realmName=");
        sb.append(adminEvent.getAuthDetails().getRealmName());
        sb.append(", clientId=");
        sb.append(adminEvent.getAuthDetails().getClientId());
        sb.append(", userId=");
        sb.append(adminEvent.getAuthDetails().getUserId());
        sb.append(", ipAddress=");
        sb.append(adminEvent.getAuthDetails().getIpAddress());
        sb.append(", resourceType=");
        sb.append(adminEvent.getResourceTypeAsString());
        sb.append(", resourcePath=");
        sb.append(adminEvent.getResourcePath());

        if (adminEvent.getError() != null) {
            sb.append(", error=");
            sb.append(adminEvent.getError());
        }

        if (adminEvent.getDetails() != null) {
            for (Map.Entry<String, String> e : adminEvent.getDetails().entrySet()) {
                sb.append(", ");
                sb.append(e.getKey());
                sb.append("=");
                sb.append(e.getValue());
            }
        }

        System.out.println(sb.toString());

    }

    @Override
    public void close() {
    }

}

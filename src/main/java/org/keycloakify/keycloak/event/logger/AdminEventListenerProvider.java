package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class AdminEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) { }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean includeRepresentation) {

        String realm = null;

        try{
            realm = adminEvent.getAuthDetails().getRealmId();
        }catch(Exception e){
            realm = "unknown";
        }

        if( realm.equals("master") ){
            return;
        }

        System.out.println("keycloakify-logging: REALM_CONFIG_CHANGED - realm id: " + realm);

    }

    @Override
    public void close() {
    }

}

package org.keycloakify.keycloak.event.logger;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class AdminEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) { }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean includeRepresentation) {

        String realmName = null;

        try{
            realmName = adminEvent.getAuthDetails().getRealmName();

        }catch(Exception e){
            realmName = "cannot_tell_on_older_keycloak_version";
        }

        if( realmName.equals("master") ){
            return;
        }

        System.out.println("keycloakify-logging: REALM_CONFIG_CHANGED - realmName=" + realmName);

    }

    @Override
    public void close() {
    }

}

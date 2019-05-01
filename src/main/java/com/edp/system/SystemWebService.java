package com.edp.system;


import com.edp.organization.OrganizationDataService;
import com.edp.organization.models.Company;
import com.edp.organization.models.Group;
import com.edp.organization.models.SecUser;
import com.edp.system.models.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;


@Service
public class SystemWebService {

    @Autowired
    SystemDataService systemDataService;

    Mono<ServerResponse> userNotFound = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(new SecUser()), SecUser.class);

    public SystemWebService() {}


    /**
     * GET ALL Users info from database
     */

    public Mono<ServerResponse> getAllAction(ServerRequest request) {
        Flux<Action> actionFlux = systemDataService.getAllAction();

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(actionFlux, Action.class);
    }






}

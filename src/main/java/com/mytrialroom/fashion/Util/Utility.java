package com.mytrialroom.fashion.Util;

import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

/**
 * Created by amarchattiwar on 10/8/16.
 */

@Component
public class Utility {

    public Response getServiceResponse(Object entityObject, Response.Status code, URI newUri) {
        return Response.created(newUri).status(code).entity(entityObject).type(MediaType.APPLICATION_JSON).build();
    }
}

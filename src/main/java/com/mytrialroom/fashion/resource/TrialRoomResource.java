package com.mytrialroom.fashion.resource;

import com.mytrialroom.fashion.Util.Utility;
import com.mytrialroom.fashion.dto.TrialRoomRespDto;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by amarchattiwar on 10/8/16.
 */

@Service
@Path("/mytrialroom")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "mytrialroom")
public class TrialRoomResource {

    @Autowired
    private Utility utility;

    @GET
    @ApiOperation(value = "Provides the basic information about the service", response = Response.class)
    public Response getTrialRoomInfo() {
        TrialRoomRespDto respDto = new TrialRoomRespDto();
        respDto.setMessage("This service is running fine");
        return utility.getServiceResponse(respDto, Response.Status.OK, null);
    }
}

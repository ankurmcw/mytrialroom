package com.mytrialroom.fashion.resource;

import com.mytrialroom.fashion.Util.Utility;
import com.mytrialroom.fashion.dto.TrialRoomRespDto;
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
@Path("/mytrialroom/latest")
@Produces(MediaType.APPLICATION_JSON)
public class LatestResource {

    @Autowired
    private Utility utility;

    @GET
    public Response getLatestInfo() {
        TrialRoomRespDto respDto = new TrialRoomRespDto();
        respDto.setMessage("This service is running fine");
        return utility.getServiceResponse(respDto, Response.Status.OK, null);
    }
}

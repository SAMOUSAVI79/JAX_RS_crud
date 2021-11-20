package resources;


import model.MessageModel;
import service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/message")
public class messageResource {
    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)

    public List<MessageModel> getMessage(){
        return messageService.getAllMessage();
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public MessageModel getMessage(@PathParam("messageId") long id){

        return messageService.getMessage(id) ;
    }
}

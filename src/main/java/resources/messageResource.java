package resources;


import model.MessageModel;
import service.MessageService;

import javax.ws.rs.*;
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

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public MessageModel addMessage(MessageModel message){
        return messageService.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public MessageModel updateMessage(@PathParam("messageId") long id ,MessageModel message){
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public void deleteMessage(@PathParam("messageId") long id ){
         messageService.removeMessage(id); 
    }
}

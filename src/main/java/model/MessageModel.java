package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.glassfish.jersey.server.JSONP;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class MessageModel {


    private long id;
    private String message;
    private Date createdDate;
    private String author;

    public MessageModel(){

    }

    public MessageModel(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.createdDate = createdDate;
        this.author = author;
        this.createdDate = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

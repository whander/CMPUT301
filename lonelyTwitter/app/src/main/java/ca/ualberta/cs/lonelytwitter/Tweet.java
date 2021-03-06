package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {

    protected String message;
    protected Date date;

    public Tweet(String message){
        this.message=message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    public void setMessage(String message) throws TooLongTweetException{
        if (message.length() > 140){
            throw new TooLongTweetException();
        }
        this.message = message;

    }//end setMessage

    public void setDate(){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract boolean isImportant();

}

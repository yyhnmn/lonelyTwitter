package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood {
    @Override
    public String representMood() {
        return "sad";
    }
    SadMood(Date date){
        super(date);
    }

    SadMood(){
        super();
    }
}

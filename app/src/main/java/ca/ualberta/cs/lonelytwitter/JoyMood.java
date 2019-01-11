package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class JoyMood extends Mood {
    @Override
    public String representMood() {
        return "joy";
    }

    JoyMood(Date date){
        super(date);
    }

    JoyMood(){
        super();
    }
}

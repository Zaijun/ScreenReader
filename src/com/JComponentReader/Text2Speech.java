
package com.JComponentReader;

import com.sun.speech.freetts.VoiceManager;

public class Text2Speech {
    
    private String name;
    private com.sun.speech.freetts.Voice systemVoice;

    
    public Text2Speech(String name){
        this.name = name;
        this.systemVoice = VoiceManager.getInstance().getVoice(this.name);
        this.systemVoice.allocate();
    }

    //Text to speech method for string array.
    public void say(String[] thingsToSay){
        for (int i = 0; i < thingsToSay.length; i++)
        {
            this.say( thingsToSay[i] );
        }
    }
    
    //Text to speech method for a string.
    public void say(String thingToSay){
        this.systemVoice.speak(thingToSay);
    }

    
    public void dispose(){
        this.systemVoice.deallocate();
    }
}

package com.example.riyasharma.mychat;

/**
 * Created by RiyaSharma on 13-10-2016.
 */
public class Contact {
    private String jid;

    public Contact(String contactJid )
    {
        jid = contactJid;
    }

    public String getJid()
    {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }
}

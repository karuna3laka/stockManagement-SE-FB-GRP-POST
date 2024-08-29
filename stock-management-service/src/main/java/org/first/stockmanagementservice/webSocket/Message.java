package org.first.stockmanagementservice.webSocket;

public class Message {
    public String Massage;

    public String getMassage() {
        return Massage;
    }

    public void setMassage(String massage) {
        Massage = massage;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String sendTo;
}

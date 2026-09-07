package edu.uees.disenosoftware.adapter;

public class MicrosoftTeamsAPI {
    public String scheduleOnlineMeeting(String subject, String organizer) {
        System.out.println("Teams agenda reunión: " + subject + " organizada por " + organizer);
        return "https://teams.microsoft.com/meeting/abc";
    }
}
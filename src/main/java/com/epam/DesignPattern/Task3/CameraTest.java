package com.epam.DesignPattern.Task3;

public class CameraTest {

    public static void main(String[] args) {

        PhoneCameraApp app = new CameraPlusApp();

        app.takePhoto();
        app.editPhoto();
        app.savePhoto();

        // User chooses how to share
        app.setShareStrategy(new EmailShare());
        app.performShare("Vacation.jpg");

        // Later user changes mind
        app.setShareStrategy(new SocialMediaShare());
        app.performShare("Vacation.jpg");
    }
}
package Head_First.Module_Command.simpleremote;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        GarageDoorStopCommand garageDoorStopCommand = new GarageDoorStopCommand(garageDoor);
        GarageDoorLightOffCommand garageDoorLightOffCommand = new GarageDoorLightOffCommand(garageDoor);
        GarageLightOnCommand garageLightOnCommand = new GarageLightOnCommand(garageDoor);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        remote.setCommand(garageLightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorStopCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorDownCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorLightOffCommand);
        remote.buttonWasPressed();
        remote.setCommand(lightOn);
        remote.buttonWasPressed();


    }

}

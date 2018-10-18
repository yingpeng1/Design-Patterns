package command;

/**
 * 可以设置命令与命令的接收者
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        invoker.setOnCommands(lightOnCommand,0);
        invoker.setOffCommands(lightOffCommand,0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
